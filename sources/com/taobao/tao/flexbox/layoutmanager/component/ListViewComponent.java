package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.b;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.view.layoutmanager.CustomGridLayoutManager;
import com.taobao.tao.flexbox.layoutmanager.view.layoutmanager.CustomLinearLayoutManager;
import com.taobao.tao.flexbox.layoutmanager.view.layoutmanager.CustomStaggeredGridLayoutManager;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import tb.akt;
import tb.d27;
import tb.gz0;
import tb.hk8;
import tb.igs;
import tb.ipn;
import tb.ir2;
import tb.jfw;
import tb.lkc;
import tb.nwv;
import tb.o3g;
import tb.od0;
import tb.ol4;
import tb.pg1;
import tb.rbi;
import tb.rug;
import tb.s6o;
import tb.sxo;
import tb.t2o;
import tb.tfs;
import tb.tig;
import tb.ugw;
import tb.vhd;
import tb.w2w;
import tb.ytn;
import tb.zk4;
import tb.zk9;
import tb.ztn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ListViewComponent extends Component<TNodeRecyclerView, l> implements RecyclerView.RecyclerListener, ol4, sxo, com.taobao.tao.flexbox.layoutmanager.core.j, BottomSheetComponentInterface.a, o3g, lkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String F;
    public vhd G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public ItemTouchHelper f12038a;
    public DragToRefreshFeature d;
    public GridLayoutManager.SpanSizeLookup e;
    public String[] h;
    public BottomSheetComponentInterface j;
    public List<ScrollChangeListener> k;
    public int l;
    public int m;
    public RecyclerViewAdapter.g n;
    public d27 s;
    public RecyclerView.ItemAnimator t;
    public ViewTreeObserver.OnGlobalLayoutListener u;
    public int v;
    public RecyclerViewAdapter y;
    public int b = -1;
    public int c = -1;
    public final SparseIntArray f = new SparseIntArray();
    public final SparseIntArray g = new SparseIntArray();
    public final HashSet<n> i = new HashSet<>();
    public final Handler o = new Handler(Looper.getMainLooper());
    public final int p = akt.s2();
    public com.taobao.tao.flexbox.layoutmanager.component.b q = null;
    public final rug r = new rug(this);
    public float w = Float.NaN;
    public final Handler x = new e(Looper.getMainLooper());
    public int z = 0;
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = true;
    public final ArrayList<tig> E = new ArrayList<>();
    public final ipn I = new ipn();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RecyclerViewAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final n f12042a;
        public int b = 0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RecyclerViewHolder extends RecyclerView.ViewHolder {
            static {
                t2o.a(503316764);
            }

            public RecyclerViewHolder(RecyclerViewAdapter recyclerViewAdapter, View view) {
                super(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.ViewHolder f12043a;

            public a(RecyclerView.ViewHolder viewHolder) {
                this.f12043a = viewHolder;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                ((TNodeRecyclerView) ListViewComponent.t1(ListViewComponent.this)).setHookTouchEvent(false);
                ListViewComponent listViewComponent = ListViewComponent.this;
                ListViewComponent.k(listViewComponent, ListViewComponent.v(listViewComponent, -1));
                ListViewComponent listViewComponent2 = ListViewComponent.this;
                View b1 = ListViewComponent.b1(listViewComponent2, listViewComponent2.getView());
                if (b1 != null) {
                    b1.setZ(1.0f);
                }
                ListViewComponent.u1(ListViewComponent.this).startDrag(this.f12043a);
                return true;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ n f12044a;
            public final /* synthetic */ FrameLayout b;
            public final /* synthetic */ int c;

            public b(n nVar, FrameLayout frameLayout, int i) {
                this.f12044a = nVar;
                this.b = frameLayout;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                igs.a("onBindViewHolderRender");
                if (ListViewComponent.this.getView() != null) {
                    if (!this.f12044a.A0() || this.f12044a.F0() || this.f12044a.C0()) {
                        RecyclerViewAdapter.U(RecyclerViewAdapter.this);
                        this.f12044a.b1(this.b.getContext());
                    }
                    if (this.f12044a.w0() != null) {
                        ViewParent parent = this.f12044a.w0().getParent();
                        FrameLayout frameLayout = this.b;
                        if (parent != frameLayout) {
                            frameLayout.removeAllViews();
                            if (this.f12044a.w0().getParent() != null) {
                                ((ViewGroup) this.f12044a.w0().getParent()).removeAllViews();
                            }
                            RecyclerViewAdapter.V(RecyclerViewAdapter.this, this.b, this.c, false);
                            this.b.addView(this.f12044a.w0(), RecyclerViewAdapter.M(RecyclerViewAdapter.this, this.f12044a));
                        }
                    }
                    igs.c();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class c implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.ViewHolder f12045a;
            public final /* synthetic */ Runnable b;

            public c(RecyclerView.ViewHolder viewHolder, Runnable runnable) {
                this.f12045a = viewHolder;
                this.b = runnable;
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                Object tag = this.f12045a.itemView.getTag(R.id.layout_manager_cell_tag_detach_id);
                if (tag != null && ((Boolean) tag).booleanValue()) {
                    RecyclerViewAdapter.N(RecyclerViewAdapter.this);
                    return false;
                } else if (!((TNodeRecyclerView) ListViewComponent.o(ListViewComponent.this)).isInSLowScroll()) {
                    RecyclerViewAdapter.N(RecyclerViewAdapter.this);
                    return true;
                } else if (RecyclerViewAdapter.S(RecyclerViewAdapter.this) > 0) {
                    RecyclerViewAdapter.N(RecyclerViewAdapter.this);
                    return true;
                } else {
                    this.b.run();
                    return false;
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.ViewHolder f12046a;
            public final /* synthetic */ Runnable b;

            public d(RecyclerView.ViewHolder viewHolder, Runnable runnable) {
                this.f12046a = viewHolder;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Object tag = this.f12046a.itemView.getTag(R.id.layout_manager_cell_tag_detach_id);
                if ((tag != null && ((Boolean) tag).booleanValue()) || !((TNodeRecyclerView) ListViewComponent.p(ListViewComponent.this)).isInSLowScroll()) {
                    return;
                }
                if (RecyclerViewAdapter.S(RecyclerViewAdapter.this) > 0) {
                    RecyclerViewAdapter.N(RecyclerViewAdapter.this);
                    ListViewComponent.q(ListViewComponent.this).post(this);
                    return;
                }
                this.b.run();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.ViewHolder f12047a;
            public final /* synthetic */ n b;

            public e(RecyclerView.ViewHolder viewHolder, n nVar) {
                this.f12047a = viewHolder;
                this.b = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (nwv.a0(this.f12047a.itemView)) {
                    RecyclerViewAdapter.P(RecyclerViewAdapter.this, this.b);
                } else {
                    ListViewComponent.D(ListViewComponent.this).add(this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class f implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ n f12048a;

            public f(n nVar) {
                this.f12048a = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    RecyclerViewAdapter.P(RecyclerViewAdapter.this, this.f12048a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class g implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f12049a;

            static {
                t2o.a(503316763);
            }

            public g(int i) {
                this.f12049a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    igs.a("checkLoadMore");
                    if (RecyclerViewAdapter.O(RecyclerViewAdapter.this, this.f12049a)) {
                        ListViewComponent.this.loadMore();
                    }
                    igs.c();
                } catch (Exception e) {
                    tfs.e("TNode", e.getMessage());
                }
            }
        }

        static {
            t2o.a(503316755);
        }

        public RecyclerViewAdapter() {
            if (!((ArrayList) ListViewComponent.l1(ListViewComponent.this).d).isEmpty()) {
                this.f12042a = (n) ((ArrayList) ListViewComponent.n1(ListViewComponent.this).d).get(0);
            }
        }

        public static /* synthetic */ FrameLayout.LayoutParams M(RecyclerViewAdapter recyclerViewAdapter, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("bc871aba", new Object[]{recyclerViewAdapter, nVar});
            }
            return recyclerViewAdapter.Y(nVar);
        }

        public static /* synthetic */ void N(RecyclerViewAdapter recyclerViewAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e27eb05", new Object[]{recyclerViewAdapter});
            } else {
                recyclerViewAdapter.g0();
            }
        }

        public static /* synthetic */ boolean O(RecyclerViewAdapter recyclerViewAdapter, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("efdb8e06", new Object[]{recyclerViewAdapter, new Integer(i)})).booleanValue();
            }
            return recyclerViewAdapter.f0(i);
        }

        public static /* synthetic */ void P(RecyclerViewAdapter recyclerViewAdapter, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2e26bd0", new Object[]{recyclerViewAdapter, nVar});
            } else {
                recyclerViewAdapter.h0(nVar);
            }
        }

        public static /* synthetic */ n Q(RecyclerViewAdapter recyclerViewAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("3a7b1654", new Object[]{recyclerViewAdapter});
            }
            return recyclerViewAdapter.b0();
        }

        public static /* synthetic */ int S(RecyclerViewAdapter recyclerViewAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ef4587a2", new Object[]{recyclerViewAdapter})).intValue();
            }
            return recyclerViewAdapter.b;
        }

        public static /* synthetic */ int T(RecyclerViewAdapter recyclerViewAdapter, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7b8ffe5", new Object[]{recyclerViewAdapter, new Integer(i)})).intValue();
            }
            recyclerViewAdapter.b = i;
            return i;
        }

        public static /* synthetic */ int U(RecyclerViewAdapter recyclerViewAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2099cdaa", new Object[]{recyclerViewAdapter})).intValue();
            }
            int i = recyclerViewAdapter.b;
            recyclerViewAdapter.b = 1 + i;
            return i;
        }

        public static /* synthetic */ void V(RecyclerViewAdapter recyclerViewAdapter, FrameLayout frameLayout, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57fdf24", new Object[]{recyclerViewAdapter, frameLayout, new Integer(i), new Boolean(z)});
            } else {
                recyclerViewAdapter.j0(frameLayout, i, z);
            }
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewAdapter recyclerViewAdapter, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 430758011) {
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            } else if (hashCode == 1995301502) {
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$RecyclerViewAdapter");
            }
        }

        public final void W(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc7e46b9", new Object[]{this, new Integer(i)});
                return;
            }
            if (ListViewComponent.U0(ListViewComponent.this) != null) {
                ListViewComponent.L0(ListViewComponent.this).removeCallbacks(ListViewComponent.U0(ListViewComponent.this));
            }
            ListViewComponent.V0(ListViewComponent.this, new g(i));
            if (ListViewComponent.W0(ListViewComponent.this) <= 0 || ListViewComponent.L(ListViewComponent.this) <= 0) {
                ListViewComponent.L0(ListViewComponent.this).post(ListViewComponent.U0(ListViewComponent.this));
                return;
            }
            ListViewComponent.U0(ListViewComponent.this).run();
            ListViewComponent.V0(ListViewComponent.this, null);
        }

        public final void X(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bb9318f", new Object[]{this, view});
                return;
            }
            view.setTag(R.id.layout_manager_cell_tag_detach_id, null);
            view.setTag(R.id.layout_manager_cell_tag_task_id, null);
            view.setTag(R.id.layout_manager_cell_tag_timeout_task_id, null);
        }

        public final FrameLayout.LayoutParams Y(n nVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("f65a3904", new Object[]{this, nVar});
            }
            if (((l) ListViewComponent.o1(ListViewComponent.this)).S0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, nVar.S().b);
                jfw viewParams = nVar.K().getViewParams();
                layoutParams.leftMargin = viewParams.k;
                layoutParams.rightMargin = viewParams.l;
                layoutParams.topMargin = viewParams.m;
                layoutParams.bottomMargin = viewParams.n;
                return layoutParams;
            }
            if (((l) ListViewComponent.p1(ListViewComponent.this)).B0 > 0) {
                i = nVar.S().f27261a;
            } else {
                i = -1;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, nVar.S().b);
            jfw viewParams2 = nVar.K().getViewParams();
            layoutParams2.leftMargin = viewParams2.k;
            layoutParams2.rightMargin = viewParams2.l;
            layoutParams2.topMargin = viewParams2.m;
            layoutParams2.bottomMargin = viewParams2.n;
            return layoutParams2;
        }

        public final Runnable Z(n nVar, FrameLayout frameLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("cf4f2d68", new Object[]{this, nVar, frameLayout, new Integer(i)});
            }
            return new b(nVar, frameLayout, i);
        }

        public final void a0(FrameLayout frameLayout, int i, n nVar, RecyclerView.ViewHolder viewHolder, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cd3e30", new Object[]{this, frameLayout, new Integer(i), nVar, viewHolder, runnable});
                return;
            }
            frameLayout.removeAllViews();
            j0(frameLayout, i, false);
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setBackgroundColor(-1);
            frameLayout2.setBackgroundDrawable(((l) ListViewComponent.m(ListViewComponent.this)).W0);
            frameLayout.addView(frameLayout2, Y(nVar));
            if (((TNodeRecyclerView) ListViewComponent.n(ListViewComponent.this)).isInSLowScroll()) {
                nwv.y0(runnable);
                this.b = 0;
                return;
            }
            c cVar = new c(viewHolder, runnable);
            d dVar = new d(viewHolder, runnable);
            Looper.myQueue().addIdleHandler(cVar);
            frameLayout.setTag(R.id.layout_manager_cell_tag_task_id, cVar);
            if (akt.s()) {
                ListViewComponent.q(ListViewComponent.this).postDelayed(dVar, ListViewComponent.r(ListViewComponent.this));
                frameLayout.setTag(R.id.layout_manager_cell_tag_timeout_task_id, dVar);
            }
        }

        public final n b0() {
            int size;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("55278766", new Object[]{this});
            }
            n nVar = this.f12042a;
            if (nVar != null && (size = ((ArrayList) nVar.d).size()) > 0) {
                if (ListViewComponent.D0(ListViewComponent.this) == 0) {
                    return (n) ((ArrayList) this.f12042a.d).get(0);
                }
                if (size > 1) {
                    return (n) ((ArrayList) this.f12042a.d).get(1);
                }
            }
            return null;
        }

        public n d0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("e662b913", new Object[]{this, new Integer(i)});
            }
            return ListViewComponent.u(ListViewComponent.this, c0(i));
        }

        public final boolean e0(long j, int i, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bfef4930", new Object[]{this, new Long(j), new Integer(i), nVar})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            int r2 = akt.r2();
            if (r2 <= 0 || i <= r2 || nVar.w0() != null || ((l) ListViewComponent.l(ListViewComponent.this)).W0 == null || currentTimeMillis <= 5) {
                return false;
            }
            return true;
        }

        public final boolean f0(int i) {
            n b0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a37c2ab", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if ((((TNodeRecyclerView) ListViewComponent.w(ListViewComponent.this)).isScrollUp() || ListViewComponent.W0(ListViewComponent.this) != 0) && !ListViewComponent.P0(ListViewComponent.this) && ListViewComponent.x(ListViewComponent.this)[1] && ((l) ListViewComponent.y(ListViewComponent.this)).G0 > 0 && (b0 = b0()) != null) {
                int size = ((ArrayList) b0.d).size() + ListViewComponent.D0(ListViewComponent.this);
                int W0 = size - ((ListViewComponent.W0(ListViewComponent.this) + 3) * ((l) ListViewComponent.z(ListViewComponent.this)).w0);
                if (ListViewComponent.W0(ListViewComponent.this) == 0) {
                    if (i == Math.max(0, W0)) {
                        return true;
                    }
                } else if (ListViewComponent.W0(ListViewComponent.this) > 0) {
                    if (i >= Math.max(0, W0)) {
                        return true;
                    }
                    if (ListViewComponent.L(ListViewComponent.this) > 0) {
                        ListViewComponent.N(ListViewComponent.this);
                        return true;
                    }
                }
                int i2 = 0;
                for (int i3 = i + 1; i3 < size; i3++) {
                    n f2 = com.taobao.tao.flexbox.layoutmanager.component.b.f((n) ((ArrayList) b0.d).get(i3 - ListViewComponent.D0(ListViewComponent.this)), false, true);
                    if (f2.S() == null || (i2 = i2 + f2.S().b) > ((l) ListViewComponent.A(ListViewComponent.this)).G0) {
                        return false;
                    }
                }
                if (i2 <= ((l) ListViewComponent.B(ListViewComponent.this)).G0) {
                    return true;
                }
            }
            return false;
        }

        public final void g0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else if (this.b > 0) {
                ListViewComponent.L0(ListViewComponent.this).post(new com.taobao.tao.flexbox.layoutmanager.component.c(this));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            n b0 = b0();
            if (b0 != null) {
                return ((ArrayList) b0.d).size() + ListViewComponent.D0(ListViewComponent.this);
            }
            return ListViewComponent.D0(ListViewComponent.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        public final void h0(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b2fc3d", new Object[]{this, nVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(ListViewComponent.this.getScrollState()));
            hashMap.put("type", "item");
            ListViewComponent.this.sendMessage(130, nVar, "onwillappear", null, hashMap, null);
        }

        public final void i0(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54f4b381", new Object[]{this, nVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(ListViewComponent.this.getScrollState()));
            hashMap.put("type", "item");
            ListViewComponent.this.sendMessage(Component.MSG_FLAG_DISAPPEAR, nVar, "onwilldisappear", null, hashMap, null);
        }

        public final void j0(FrameLayout frameLayout, int i, boolean z) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef7e3596", new Object[]{this, frameLayout, new Integer(i), new Boolean(z)});
            } else if (!((l) ListViewComponent.q1(ListViewComponent.this)).S0 && ListViewComponent.this.getView() != null && ((l) ListViewComponent.r1(ListViewComponent.this)).J0) {
                StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) frameLayout.getLayoutParams();
                if (((CustomStaggeredGridLayoutManager) ListViewComponent.this.getView().getLayoutManager()).z(i) != ((l) ListViewComponent.s1(ListViewComponent.this)).w0) {
                    z2 = false;
                }
                if (layoutParams != null) {
                    layoutParams.setFullSpan(z2);
                    if (z) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                    return;
                }
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                layoutParams2.setFullSpan(z2);
                if (z) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                }
                frameLayout.setLayoutParams(layoutParams2);
            }
        }

        public final void k0(n nVar, ViewGroup viewGroup, RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d70e8b02", new Object[]{this, nVar, viewGroup, viewHolder});
            } else if (nwv.o(nVar.H("enabled-drag"), false)) {
                viewGroup.setClipChildren(false);
                nVar.w1(2, new a(viewHolder));
            } else {
                viewGroup.setClipChildren(nwv.o(nVar.H("clip-children"), true));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ee143bc", new Object[]{this, viewHolder, new Integer(i), list});
            } else {
                onBindViewHolder(viewHolder, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new RecyclerViewHolder(this, new FrameLayout(viewGroup.getContext()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
                return;
            }
            super.onViewAttachedToWindow(viewHolder);
            View view = viewHolder.itemView;
            int i = R.id.layout_manager_cell_tag_detach_id;
            Object tag = view.getTag(i);
            if (tag != null && ((Boolean) tag).booleanValue()) {
                viewHolder.itemView.setTag(i, null);
                View view2 = viewHolder.itemView;
                int i2 = R.id.layout_manager_cell_tag_task_id;
                Object tag2 = view2.getTag(i2);
                viewHolder.itemView.setTag(i2, null);
                if (tag2 instanceof MessageQueue.IdleHandler) {
                    Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler) tag2);
                }
                View view3 = viewHolder.itemView;
                int i3 = R.id.layout_manager_cell_tag_timeout_task_id;
                Object tag3 = view3.getTag(i3);
                viewHolder.itemView.setTag(i3, null);
                if (tag3 instanceof Runnable) {
                    ListViewComponent.q(ListViewComponent.this).postDelayed((Runnable) tag3, ListViewComponent.r(ListViewComponent.this));
                }
            }
            n nVar = (n) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
            if (nVar != null) {
                n Y = nVar.Y();
                if (ListViewComponent.C(ListViewComponent.this) == null) {
                    if (akt.N()) {
                        z = ListViewComponent.F(ListViewComponent.this).z0();
                    }
                    if (z) {
                        nwv.y0(new f(Y));
                    }
                } else if (ListViewComponent.C(ListViewComponent.this).isInIdle()) {
                    nwv.y0(new e(viewHolder, Y));
                } else {
                    ListViewComponent.D(ListViewComponent.this).add(Y);
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
            viewHolder.itemView.setTag(R.id.layout_manager_cell_tag_detach_id, Boolean.TRUE);
            n nVar = (n) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
            if (nVar != null) {
                n Y = nVar.Y();
                if (ListViewComponent.C(ListViewComponent.this) == null) {
                    i0(Y);
                } else if (ListViewComponent.D(ListViewComponent.this).contains(Y)) {
                    ListViewComponent.D(ListViewComponent.this).remove(Y);
                } else {
                    i0(Y);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
            n c0 = c0(i);
            if (c0 != null) {
                ListViewComponent.s(ListViewComponent.this);
                com.taobao.tao.flexbox.layoutmanager.component.b.l(ListViewComponent.s(ListViewComponent.this), c0);
                n u = ListViewComponent.u(ListViewComponent.this, c0);
                if (u != null) {
                    X(frameLayout);
                    if (u.r0().equals(WXBasicComponentType.CELL)) {
                        frameLayout.removeAllViews();
                        frameLayout.setTag(R.id.layout_manager_cell_tag_id, null);
                        if (((ArrayList) u.d).isEmpty()) {
                            j0(frameLayout, i, true);
                            return;
                        }
                        u = (n) ((ArrayList) u.d).get(0);
                    }
                    try {
                        if (u.D0()) {
                            u.K0();
                        }
                        k0(u, frameLayout, viewHolder);
                        Runnable Z = Z(u, frameLayout, i);
                        if (e0(currentTimeMillis, i, u)) {
                            a0(frameLayout, i, u, viewHolder, Z);
                        } else {
                            Z.run();
                            this.b = 0;
                        }
                        frameLayout.setTag(R.id.layout_manager_cell_tag_id, u);
                    } catch (Exception e2) {
                        tfs.e("TNode", e2.getMessage());
                    }
                    W(i);
                }
            }
        }

        public final n c0(int i) {
            n nVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("40851834", new Object[]{this, new Integer(i)});
            }
            if (i < 0) {
                return null;
            }
            if (this.f12042a == null) {
                tfs.g("ListViewComponent", "section is null");
                return null;
            } else if (i == 0 && ListViewComponent.D0(ListViewComponent.this) == 1) {
                return (n) ((ArrayList) this.f12042a.d).get(0);
            } else {
                if (ListViewComponent.D0(ListViewComponent.this) == 0) {
                    nVar = (n) ((ArrayList) this.f12042a.d).get(0);
                } else {
                    nVar = (n) ((ArrayList) this.f12042a.d).get(1);
                }
                if (i - ListViewComponent.D0(ListViewComponent.this) >= ((ArrayList) nVar.d).size()) {
                    return null;
                }
                return (n) ((ArrayList) nVar.d).get(i - ListViewComponent.D0(ListViewComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12050a;

        static {
            t2o.a(503316765);
        }

        public SmoothScroller(ListViewComponent listViewComponent, Context context, int i) {
            super(context);
            this.f12050a = i;
        }

        public static /* synthetic */ Object ipc$super(SmoothScroller smoothScroller, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$SmoothScroller");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue();
            }
            if (this.f12050a == 2) {
                return 1;
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            if (this.f12050a == 2) {
                return 1;
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else {
                super.onStop();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0683a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0683a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ListViewComponent.N0(ListViewComponent.this).onDragRefreshComplete();
                }
            }
        }

        public a() {
        }

        @Override // tb.hk8
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            ListViewComponent.L0(ListViewComponent.this).removeMessages(0);
            ListViewComponent.M0(ListViewComponent.this, false);
            nwv.A0(new RunnableC0683a(), 150L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements hk8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.hk8
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            ListViewComponent.L0(ListViewComponent.this).removeMessages(1);
            ListViewComponent.Q0(ListViewComponent.this, false);
            ListViewComponent.N0(ListViewComponent.this).onDragRefreshComplete();
            ListViewComponent.R0(ListViewComponent.this, false);
            if (ListViewComponent.S0(ListViewComponent.this) != null && !((TNodeRecyclerView) ListViewComponent.T0(ListViewComponent.this)).isInSLowScroll() && ListViewComponent.U0(ListViewComponent.this) != null && ListViewComponent.W0(ListViewComponent.this) > 0) {
                ListViewComponent.U0(ListViewComponent.this).run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12054a;

        public c(int i) {
            this.f12054a = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View findViewByPosition;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (ListViewComponent.X0(ListViewComponent.this) != null && (findViewByPosition = ((TNodeRecyclerView) ListViewComponent.Y0(ListViewComponent.this)).getLayoutManager().findViewByPosition(this.f12054a)) != null) {
                ugw.b(ListViewComponent.Z0(ListViewComponent.this), this);
                if (((l) ListViewComponent.a1(ListViewComponent.this)).v == YogaFlexDirection.ROW) {
                    i = (((TNodeRecyclerView) ListViewComponent.c1(ListViewComponent.this)).getWidth() - findViewByPosition.getWidth()) / 2;
                } else {
                    i = (((TNodeRecyclerView) ListViewComponent.d1(ListViewComponent.this)).getHeight() - findViewByPosition.getHeight()) / 2;
                }
                if (((TNodeRecyclerView) ListViewComponent.e1(ListViewComponent.this)).getLayoutManager() instanceof StaggeredGridLayoutManager) {
                    ((StaggeredGridLayoutManager) ((TNodeRecyclerView) ListViewComponent.f1(ListViewComponent.this)).getLayoutManager()).scrollToPositionWithOffset(this.f12054a, i);
                } else if (((TNodeRecyclerView) ListViewComponent.g1(ListViewComponent.this)).getLayoutManager() instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) ((TNodeRecyclerView) ListViewComponent.h1(ListViewComponent.this)).getLayoutManager()).scrollToPositionWithOffset(this.f12054a, i);
                } else if (((TNodeRecyclerView) ListViewComponent.i1(ListViewComponent.this)).getLayoutManager() instanceof GridLayoutManager) {
                    ((GridLayoutManager) ((TNodeRecyclerView) ListViewComponent.j1(ListViewComponent.this)).getLayoutManager()).scrollToPositionWithOffset(this.f12054a, i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12055a;
        public final /* synthetic */ float b;

        public d(int i, float f) {
            this.f12055a = i;
            this.b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ListViewComponent.k1(ListViewComponent.this, this.f12055a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            hk8 a1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (ListViewComponent.h(ListViewComponent.this) != null) {
                int i = message.what;
                if ((i == 0 || i == 1) && (a1 = ListViewComponent.i(ListViewComponent.this).a1((String) message.obj)) != null) {
                    a1.onSuccess(null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12057a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public f(int i, String str, Map map) {
            this.f12057a = i;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ListViewComponent.W(ListViewComponent.this) != null) {
                int[] findVisibleItemPositionRange = ((TNodeRecyclerView) ListViewComponent.h0(ListViewComponent.this)).findVisibleItemPositionRange(true);
                for (int i = findVisibleItemPositionRange[0]; i <= findVisibleItemPositionRange[1] && i >= 0; i++) {
                    ListViewComponent listViewComponent = ListViewComponent.this;
                    listViewComponent.sendMessage(this.f12057a, ListViewComponent.s0(listViewComponent).d0(i), this.b, null, this.c, null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements w2w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.w2w
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7bea48f", new Object[]{this});
            }
        }

        @Override // tb.w2w
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d695bb4", new Object[]{this});
            }
        }

        @Override // tb.w2w
        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1a47724", new Object[]{this, new Integer(i)});
            } else if (i >= akt.I2(2500) && ListViewComponent.L(ListViewComponent.this) == 0) {
                ListViewComponent.M(ListViewComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f12060a;

            public a(Class cls) {
                this.f12060a = cls;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ListViewComponent.O(ListViewComponent.this, this.f12060a);
                }
            }
        }

        public h() {
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else {
                nwv.z0(new a(cls), true);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                tfs.e("ListViewComponent", "Recorder classNotFound");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements b.AbstractC0685b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.b.AbstractC0685b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ad3dde9", new Object[]{this});
            } else if (ListViewComponent.P(ListViewComponent.this) != null) {
                ListViewComponent.P(ListViewComponent.this).updateRefreshData(ListViewComponent.Q(ListViewComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12062a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public j(n nVar, int i, int i2) {
            this.f12062a = nVar;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nwv.m0(this.f12062a.u0().w(), this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements DragToRefreshFeature.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc0758f", new Object[]{this});
            } else {
                ListViewComponent.this.loadMore();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75a78153", new Object[]{this});
            } else {
                ListViewComponent.this.pullRefresh(null);
            }
        }
    }

    static {
        t2o.a(503316736);
        t2o.a(503317030);
        t2o.a(503317117);
        t2o.a(503317092);
        t2o.a(503317011);
        t2o.a(503317320);
        t2o.a(503316917);
    }

    public static /* synthetic */ jfw A(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("78907e6", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw A0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2a87795a", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw B(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("93c5bd45", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw B0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("b6c42eb9", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ BottomSheetComponentInterface C(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetComponentInterface) ipChange.ipc$dispatch("97b679f7", new Object[]{listViewComponent});
        }
        return listViewComponent.j;
    }

    public static /* synthetic */ jfw C0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4300e418", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ HashSet D(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("d78760d", new Object[]{listViewComponent});
        }
        return listViewComponent.i;
    }

    public static /* synthetic */ int D0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67fef000", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.z;
    }

    public static /* synthetic */ jfw E(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("7ff0147b", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw E0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("50387a42", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ n F(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("b379df08", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ SparseIntArray F0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("eb15030c", new Object[]{listViewComponent});
        }
        return listViewComponent.g;
    }

    public static /* synthetic */ n G(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("69e9807b", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ jfw G0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("68b1e500", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ SparseIntArray H(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("656b79f5", new Object[]{listViewComponent});
        }
        return listViewComponent.f;
    }

    public static /* synthetic */ jfw H0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("f4ee9a5f", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw I(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("b0e2e9f7", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw I0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("812b4fbe", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw J(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("3d1f9f56", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw J0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("d68051d", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw K(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c95c54b5", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw K0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("99a4ba7c", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ int L(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("294e0a72", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.l;
    }

    public static /* synthetic */ Handler L0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("467a6dae", new Object[]{listViewComponent});
        }
        return listViewComponent.x;
    }

    public static /* synthetic */ int M(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42aba47a", new Object[]{listViewComponent})).intValue();
        }
        int i2 = listViewComponent.l;
        listViewComponent.l = 1 + i2;
        return i2;
    }

    public static /* synthetic */ boolean M0(ListViewComponent listViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecff3e9d", new Object[]{listViewComponent, new Boolean(z)})).booleanValue();
        }
        listViewComponent.C = z;
        return z;
    }

    public static /* synthetic */ int N(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab98bf51", new Object[]{listViewComponent})).intValue();
        }
        int i2 = listViewComponent.l;
        listViewComponent.l = i2 - 1;
        return i2;
    }

    public static /* synthetic */ DragToRefreshFeature N0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragToRefreshFeature) ipChange.ipc$dispatch("943dd752", new Object[]{listViewComponent});
        }
        return listViewComponent.d;
    }

    public static /* synthetic */ void O(ListViewComponent listViewComponent, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c968f48", new Object[]{listViewComponent, cls});
        } else {
            listViewComponent.R1(cls);
        }
    }

    public static /* synthetic */ void O0(ListViewComponent listViewComponent, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bfabee", new Object[]{listViewComponent, new Integer(i2), new Integer(i3)});
        } else {
            listViewComponent.X1(i2, i3);
        }
    }

    public static /* synthetic */ vhd P(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vhd) ipChange.ipc$dispatch("796d4a97", new Object[]{listViewComponent});
        }
        return listViewComponent.G;
    }

    public static /* synthetic */ boolean P0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c888c234", new Object[]{listViewComponent})).booleanValue();
        }
        return listViewComponent.B;
    }

    public static /* synthetic */ JSONArray Q(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("42157218", new Object[]{listViewComponent});
        }
        return listViewComponent.x1();
    }

    public static /* synthetic */ boolean Q0(ListViewComponent listViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d25a066", new Object[]{listViewComponent, new Boolean(z)})).booleanValue();
        }
        listViewComponent.B = z;
        return z;
    }

    public static /* synthetic */ jfw R(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("20002b19", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ void R0(ListViewComponent listViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63012fc3", new Object[]{listViewComponent, new Boolean(z)});
        } else {
            listViewComponent.setupPullUpStatus(z);
        }
    }

    public static /* synthetic */ jfw S(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ac3ce078", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View S0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("99623ff4", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw T(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("387995d7", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View T0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f8cc8b5", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ int U(ListViewComponent listViewComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4055448", new Object[]{listViewComponent, nVar})).intValue();
        }
        return listViewComponent.O1(nVar);
    }

    public static /* synthetic */ RecyclerViewAdapter.g U0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter.g) ipChange.ipc$dispatch("52fabb87", new Object[]{listViewComponent});
        }
        return listViewComponent.n;
    }

    public static /* synthetic */ jfw V(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("50f30095", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ RecyclerViewAdapter.g V0(ListViewComponent listViewComponent, RecyclerViewAdapter.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter.g) ipChange.ipc$dispatch("68f10a40", new Object[]{listViewComponent, gVar});
        }
        listViewComponent.n = gVar;
        return gVar;
    }

    public static /* synthetic */ View W(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("27c8e4cc", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ int W0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abc44528", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.m;
    }

    public static /* synthetic */ jfw X(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5e2a96bf", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View X0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b20c62f8", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw Y(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ea674c1e", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View Y0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7836ebb9", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw Z(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("76a4017d", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View Z0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e61747a", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw a0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2e0b6dc", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw a1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("39b4d11a", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw b0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("8f1d6c3b", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View b1(ListViewComponent listViewComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4e82afe5", new Object[]{listViewComponent, view});
        }
        return listViewComponent.C1(view);
    }

    public static /* synthetic */ jfw c0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("1b5a219a", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View c1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c33bdd1", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw d0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a796d6f9", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View d1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d25e4692", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw e0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("33d38c58", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View e1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9888cf53", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw f0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c01041b7", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View f1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5eb35814", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw g0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4c4cf716", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View g1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("24dde0d5", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ n h(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("5dafd209", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ View h0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("edf36d8d", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ View h1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb086996", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ n i(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("ec3b530a", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ jfw i0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("59848d40", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View i1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b132f257", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ Object ipc$super(ListViewComponent listViewComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -613926416:
                super.onLayout();
                return null;
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent");
        }
    }

    public static /* synthetic */ int j(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29e2eb69", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.b;
    }

    public static /* synthetic */ jfw j0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e5c1429f", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View j1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("775d7b18", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ int k(ListViewComponent listViewComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17105ffe", new Object[]{listViewComponent, new Integer(i2)})).intValue();
        }
        listViewComponent.b = i2;
        return i2;
    }

    public static /* synthetic */ jfw k0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("71fdf7fe", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ void k1(ListViewComponent listViewComponent, int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f7ceb4", new Object[]{listViewComponent, new Integer(i2), new Float(f2)});
        } else {
            listViewComponent.c2(i2, f2);
        }
    }

    public static /* synthetic */ jfw l(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4eff868a", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw l0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("fe3aad5d", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ n l1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("956ee05a", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ jfw m(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("db3c3be9", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw m0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("8a7762bc", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw m1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a56221e3", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View n(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4334b4d", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw n0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("16b4181b", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ n n1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d56bf670", new Object[]{listViewComponent});
        }
        return listViewComponent.node;
    }

    public static /* synthetic */ View o(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("50885ccf", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw o0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a2f0cd7a", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw o1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ce831324", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View p(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16b2e590", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw p0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2f2d82d9", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw p1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5abfc883", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ Handler q(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("5c4f9a97", new Object[]{listViewComponent});
        }
        return listViewComponent.o;
    }

    public static /* synthetic */ jfw q0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("bb6a3838", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw q1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e6fc7de2", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ int r(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("611272c3", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.p;
    }

    public static /* synthetic */ jfw r0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("47a6ed97", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw r1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("73393341", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.component.b s(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.component.b) ipChange.ipc$dispatch("de59bdcc", new Object[]{listViewComponent});
        }
        return listViewComponent.N1();
    }

    public static /* synthetic */ RecyclerViewAdapter s0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("52edc613", new Object[]{listViewComponent});
        }
        return listViewComponent.y;
    }

    public static /* synthetic */ jfw s1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ff75e8a0", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ int t(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0eed26a", new Object[]{listViewComponent})).intValue();
        }
        return listViewComponent.c;
    }

    public static /* synthetic */ jfw t0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("54de83c1", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View t1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b05981b6", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ n u(ListViewComponent listViewComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d308564d", new Object[]{listViewComponent, nVar});
        }
        return listViewComponent.L1(nVar);
    }

    public static /* synthetic */ jfw u0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e11b3920", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ ItemTouchHelper u1(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemTouchHelper) ipChange.ipc$dispatch("d7df3a7c", new Object[]{listViewComponent});
        }
        return listViewComponent.f12038a;
    }

    public static /* synthetic */ int v(ListViewComponent listViewComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3181591d", new Object[]{listViewComponent, new Integer(i2)})).intValue();
        }
        listViewComponent.c = i2;
        return i2;
    }

    public static /* synthetic */ jfw v0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("6d57ee7f", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ View w(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd2f51eb", new Object[]{listViewComponent});
        }
        return listViewComponent.view;
    }

    public static /* synthetic */ jfw w0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("f994a3de", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ boolean[] x(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("70b5354b", new Object[]{listViewComponent});
        }
        return listViewComponent.checkHasMoreStatus();
    }

    public static /* synthetic */ GridLayoutManager.SpanSizeLookup x0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GridLayoutManager.SpanSizeLookup) ipChange.ipc$dispatch("b458dc35", new Object[]{listViewComponent});
        }
        return listViewComponent.e;
    }

    public static /* synthetic */ jfw y(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ef0f9d28", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw y0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("120e0e9c", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw z(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("7b4c5287", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public static /* synthetic */ jfw z0(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("9e4ac3fb", new Object[]{listViewComponent});
        }
        return listViewComponent.viewParams;
    }

    public final float A1() {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("838f715", new Object[]{this})).floatValue();
        }
        if (((l) this.viewParams).x0) {
            int K1 = K1();
            boolean p2 = akt.p2("fixComputeColumnCount", true);
            P p = this.viewParams;
            if (((l) p).y0 > 0) {
                if (p2) {
                    if (((l) p).B0 > 0 || ((l) p).C0 == null) {
                        i3 = ((l) p).B0 + K1;
                    } else if (TextUtils.equals(((l) p).C0, "average")) {
                        i3 = K1 - ((l) this.viewParams).B0;
                    }
                    P p3 = this.viewParams;
                    ((l) p3).w0 = Math.min(i3 / (((l) p3).y0 + ((l) p3).B0), ((l) p3).z0);
                }
                i3 = K1;
                P p32 = this.viewParams;
                ((l) p32).w0 = Math.min(i3 / (((l) p32).y0 + ((l) p32).B0), ((l) p32).z0);
            }
            P p4 = this.viewParams;
            if (((l) p4).B0 > 0 || ((l) p4).C0 == null) {
                i2 = (K1 - ((((l) p4).w0 - 1) * ((l) p4).B0)) / ((l) p4).w0;
            } else if (TextUtils.equals(((l) p4).C0, "average")) {
                P p5 = this.viewParams;
                i2 = (K1 - ((((l) p5).w0 + 1) * ((l) p5).B0)) / ((l) p5).w0;
            }
            return i2;
        }
        return Float.NaN;
    }

    public final n[] B1(n nVar) {
        n nVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n[]) ipChange.ipc$dispatch("2cbe6add", new Object[]{this, nVar});
        }
        int size = ((ArrayList) nVar.d).size();
        n nVar3 = null;
        if (size == 1) {
            nVar2 = (n) ((ArrayList) nVar.d).get(0);
            if (!nVar2.u0().u().equals("cells")) {
                this.z = 1;
                nVar3 = nVar2;
                nVar2 = null;
            }
        } else if (size > 1) {
            nVar3 = (n) ((ArrayList) nVar.d).get(0);
            nVar2 = (n) ((ArrayList) nVar.d).get(1);
            this.z = 1;
        } else {
            nVar2 = null;
        }
        return new n[]{nVar3, nVar2};
    }

    public final View C1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("59d10486", new Object[]{this, view});
        }
        View view2 = view;
        while (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof TNodeRecyclerView) {
                return view2;
            }
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            view2 = (View) parent;
        }
        return view;
    }

    public void D1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcf0d26", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nestY", Integer.valueOf(i2));
        hashMap.put("maxNestY", Integer.valueOf(i3));
        hashMap.put("group", this.h);
        sendMessage(getNode(), "onnestscroll", null, hashMap, null);
    }

    public void G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79b9331", new Object[]{this});
            return;
        }
        TabBarControllerComponent b2 = com.taobao.tao.flexbox.layoutmanager.component.h.b(this.node);
        if (b2 != null) {
            b2.j0();
        }
    }

    public void H1(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7555058", new Object[]{this, new Float(f2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("canScrollVertically", "-1");
        hashMap.put("mDy", Float.valueOf(f2));
        hashMap.put("group", this.h);
        sendMessage(getNode(), "canscrollvertical", null, hashMap, null);
    }

    /* renamed from: I1 */
    public l generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("bca84ccf", new Object[]{this});
        }
        return new l();
    }

    public float J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6af831d6", new Object[]{this})).floatValue();
        }
        return this.w;
    }

    public int K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3d", new Object[]{this})).intValue();
        }
        int i2 = this.measureResult.f27261a;
        if (i2 <= 0) {
            i2 = s6o.B(this.node.N());
        }
        P p = this.viewParams;
        return (i2 - ((l) p).g) - ((l) p).h;
    }

    public final n L1(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("8fa12f26", new Object[]{this, nVar});
        }
        if (nVar == null) {
            return nVar;
        }
        if (nVar.r0().equals("header")) {
            if (!((ArrayList) nVar.d).isEmpty()) {
                return (n) ((ArrayList) nVar.d).get(0);
            }
            return null;
        } else if (!((ArrayList) nVar.d).isEmpty()) {
            return (n) ((ArrayList) nVar.d).get(0);
        } else {
            return nVar;
        }
    }

    public View M1(int i2) {
        n d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("27202b10", new Object[]{this, new Integer(i2)});
        }
        RecyclerViewAdapter recyclerViewAdapter = this.y;
        if (recyclerViewAdapter == null || (d0 = recyclerViewAdapter.d0(i2)) == null || d0.w0() == null) {
            return null;
        }
        return (View) d0.w0().getParent();
    }

    public final com.taobao.tao.flexbox.layoutmanager.component.b N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.component.b) ipChange.ipc$dispatch("5466fe75", new Object[]{this});
        }
        if (this.q == null) {
            this.q = com.taobao.tao.flexbox.layoutmanager.component.b.j(getNode());
        }
        return this.q;
    }

    public final int O1(n nVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13443430", new Object[]{this, nVar})).intValue();
        }
        if (nVar.S() != null && nVar.S().f27261a > 0) {
            i2 = nVar.S().f27261a;
        }
        if (i2 > 0) {
            return i2;
        }
        return q.r(nVar);
    }

    public vhd P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vhd) ipChange.ipc$dispatch("960de1bb", new Object[]{this});
        }
        return this.G;
    }

    public final void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e913f75", new Object[]{this});
        } else if (nwv.o(this.node.H("enable-recorder"), false) && !this.H) {
            this.H = true;
            zk9.c("com.taobao.record.Recorder$Builder", new h(), AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    public final boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6a5efa4", new Object[]{this})).booleanValue();
        }
        if (this.node.d0() == null || !this.node.d0().e) {
            return true;
        }
        return false;
    }

    public boolean T1() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39cbd83", new Object[]{this})).booleanValue();
        }
        int scrollState = getScrollState();
        V v = this.view;
        if (v != 0) {
            z = ((TNodeRecyclerView) v).isInSLowScroll();
        } else {
            z = true;
        }
        if (scrollState == 0 || scrollState == 1 || z) {
            return true;
        }
        return false;
    }

    public final boolean U1(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdf4e7eb", new Object[]{this, viewHolder})).booleanValue();
        }
        try {
            if ((((Integer) ytn.b("mFlags", viewHolder)).intValue() & 4) != 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            tfs.d("isViewHolderInvalid:" + e2.getMessage());
            return false;
        }
    }

    public void W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            this.x.removeCallbacksAndMessages(null);
        }
    }

    public final void X1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d2bd6a", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        n Q = RecyclerViewAdapter.Q(this.y);
        if (Q != null) {
            nwv.m0(Q.d, i2, i3);
            this.node.P().l1(new j(Q, i2, i3));
            if (this.b == -1) {
                this.b = i2;
            }
            this.c = i3;
        }
    }

    public void Y1(w2w w2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a83ef5c", new Object[]{this, w2wVar});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((TNodeRecyclerView) v).removeVelocityChangeListener(w2wVar);
        }
    }

    public final void Z1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i2)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int headerViewsCount = i2 + ((TNodeRecyclerView) v).getHeaderViewsCount();
            if (((TNodeRecyclerView) this.view).getLayoutManager() == null) {
                return;
            }
            if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof GridLayoutManager) {
                ((GridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else {
                ((TNodeRecyclerView) this.view).scrollToPosition(headerViewsCount);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db09173", new Object[]{this, str});
        } else if (str == "large" || str == BottomSheetComponentInterface.State.HALF) {
            Iterator<n> it = this.i.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (!((ArrayList) next.d).isEmpty() && nwv.a0(((n) ((ArrayList) next.d).get(0)).w0())) {
                    RecyclerViewAdapter.P(this.y, next);
                    it.remove();
                }
            }
        }
    }

    public final void a2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb18c45", new Object[]{this, new Boolean(z)});
        } else {
            this.d.setOnDragToRefreshListener(new k());
        }
    }

    public void addScrollStateListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bab80f", new Object[]{this, scrollChangeListener});
            return;
        }
        V v = this.view;
        if (v == 0) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(scrollChangeListener);
            return;
        }
        ((TNodeRecyclerView) v).addScrollChangeListener(scrollChangeListener);
    }

    public boolean b2(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("142ca835", new Object[]{this, nVar})).booleanValue();
        }
        int O1 = O1(nVar);
        if (O1 > K1() / 2) {
            return true;
        }
        if (YogaConstants.isUndefined(this.w) || O1 <= this.w * 1.5d) {
            return false;
        }
        return true;
    }

    public final void c2(int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37bb2f6", new Object[]{this, new Integer(i2), new Float(f2)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int headerViewsCount = i2 + ((TNodeRecyclerView) v).getHeaderViewsCount();
            if (((TNodeRecyclerView) this.view).getLayoutManager() != null) {
                if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof CustomStaggeredGridLayoutManager) {
                    ((CustomStaggeredGridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).C(f2);
                } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof CustomLinearLayoutManager) {
                    ((CustomLinearLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).z(f2);
                } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof CustomGridLayoutManager) {
                    ((CustomGridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).z(f2);
                }
            }
            ((TNodeRecyclerView) this.view).smoothScrollToPosition(headerViewsCount);
        }
    }

    public final boolean[] checkHasMoreStatus() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("68a0a735", new Object[]{this});
        }
        Object H = this.node.H("hasMore");
        if (H == null) {
            H = this.node.H("hasmore");
        }
        if (H != null) {
            z2 = nwv.o(H, true);
            z = true;
        } else {
            z2 = true;
            z = false;
        }
        return new boolean[]{z, z2};
    }

    public final void d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3375d26", new Object[]{this});
            return;
        }
        V v = this.view;
        if (v != 0) {
            RecyclerView.LayoutManager layoutManager = ((TNodeRecyclerView) v).getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).setSpanCount(((l) this.viewParams).w0);
            } else if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).setSpanCount(((l) this.viewParams).w0);
            }
        }
    }

    @Override // tb.lkc
    public int getAdapterPosition(n nVar, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5a20adc", new Object[]{this, nVar, nVar2})).intValue();
        }
        if (nVar != null) {
            nVar = nVar.Y();
        }
        n Q = RecyclerViewAdapter.Q(this.y);
        if (nVar == null || Q == null || ((ArrayList) Q.d).isEmpty()) {
            return -1;
        }
        return ((ArrayList) Q.d).indexOf(nVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (str == null || !str.equals(vhd.KEY_RECORD_EXTRA)) {
            return super.getAttributeHandler(str);
        }
        return this.I;
    }

    @Override // tb.sxo
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        RecyclerViewAdapter recyclerViewAdapter = this.y;
        if (recyclerViewAdapter != null) {
            return recyclerViewAdapter.getItemCount();
        }
        return 0;
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        V v = this.view;
        if (v != 0) {
            return ((TNodeRecyclerView) v).getScrollState();
        }
        return 0;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r4.equals("onwilldisappear") == false) goto L_0x002e;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onwillappear"
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r0 = "1e782cf4"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            java.lang.Object r9 = r4.ipc$dispatch(r0, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001f:
            java.lang.String r4 = r9.d
            r4.hashCode()
            r5 = 130(0x82, float:1.82E-43)
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -1055330882: goto L_0x0073;
                case -654012496: goto L_0x0067;
                case -552345454: goto L_0x005d;
                case 209131304: goto L_0x0051;
                case 238360901: goto L_0x0045;
                case 1729966319: goto L_0x0039;
                case 2122668806: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r1 = -1
            goto L_0x007e
        L_0x0030:
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L_0x0037
            goto L_0x002e
        L_0x0037:
            r1 = 6
            goto L_0x007e
        L_0x0039:
            java.lang.String r1 = "onforcerefresh"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0043
            goto L_0x002e
        L_0x0043:
            r1 = 5
            goto L_0x007e
        L_0x0045:
            java.lang.String r1 = "onrefreshchangestate"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x004f
            goto L_0x002e
        L_0x004f:
            r1 = 4
            goto L_0x007e
        L_0x0051:
            java.lang.String r1 = "scroll_state_idle_internal"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x005b
            goto L_0x002e
        L_0x005b:
            r1 = 3
            goto L_0x007e
        L_0x005d:
            java.lang.String r7 = "onwilldisappear"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007e
            goto L_0x002e
        L_0x0067:
            java.lang.String r1 = "onpagerefreshstatechanged"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0071
            goto L_0x002e
        L_0x0071:
            r1 = 1
            goto L_0x007e
        L_0x0073:
            java.lang.String r1 = "onpagescrollstatechanged"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x007d
            goto L_0x002e
        L_0x007d:
            r1 = 0
        L_0x007e:
            switch(r1) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009b;
                case 4: goto L_0x00b9;
                case 5: goto L_0x0082;
                case 6: goto L_0x00b9;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x009a
        L_0x0082:
            com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature r0 = r8.d
            if (r0 == 0) goto L_0x009a
            V extends android.view.View r1 = r8.view
            if (r1 == 0) goto L_0x009a
            r0.setIsPositiveRefreshing()
            V extends android.view.View r0 = r8.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r0 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView) r0
            r0.scrollToPosition(r3)
            java.util.Map r9 = r9.e
            r8.pullRefresh(r9)
            return r2
        L_0x009a:
            return r3
        L_0x009b:
            java.lang.String r0 = r9.d
            java.util.Map r1 = r9.e
            r8.sendMessageToVisibleItem(r0, r1, r2, r5)
            r0 = 2048(0x800, float:2.87E-42)
            r9.a(r0)
            return r3
        L_0x00a8:
            java.lang.String r0 = r9.d
            java.util.Map r9 = r9.e
            r1 = 386(0x182, float:5.41E-43)
            r8.sendMessageToVisibleItem(r0, r9, r3, r1)
            tb.vhd r9 = r8.G
            if (r9 == 0) goto L_0x00b8
            r9.disappear()
        L_0x00b8:
            return r3
        L_0x00b9:
            java.lang.String r1 = r9.d
            java.util.Map r4 = r9.e
            r8.sendMessageToVisibleItem(r1, r4, r2, r5)
            java.lang.String r9 = r9.d
            boolean r9 = android.text.TextUtils.equals(r9, r0)
            if (r9 == 0) goto L_0x00d2
            r8.Q1()
            tb.vhd r9 = r8.G
            if (r9 == 0) goto L_0x00d2
            r9.appear()
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.okc
    public void onItemChange(int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5972ed89", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (((l) this.viewParams).X0) {
            ((TNodeRecyclerView) this.view).setItemAnimator(null);
        }
        updateAPMToken(this.view, null);
        if ((i2 & 16) != 0) {
            i4 = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i4 = this.z + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        d27 d27Var = this.s;
        if (d27Var != null) {
            d27Var.onItemChange(i2, i3 + i4);
        }
    }

    @Override // tb.okc
    public void onItemInserted(int i2, int i3, int i4, boolean z) {
        int headerViewsCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9462", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = null;
        updateAPMToken(this.view, null);
        if (((l) this.viewParams).X0) {
            if (i4 <= 1 || !S1()) {
                itemAnimator = this.t;
            }
            ((TNodeRecyclerView) this.view).setItemAnimator(itemAnimator);
        }
        if (z || (i3 == 0 && this.z == 1)) {
            z1();
        }
        if ((i2 & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i3 += this.z;
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        int i5 = i3 + headerViewsCount;
        if (i5 == 1 && this.v > 0) {
            ((TNodeRecyclerView) this.view).canScrollVertically(-1);
        }
        d27 d27Var = this.s;
        if (d27Var != null) {
            d27Var.onItemInserted(i2, i5, i4, z);
        }
    }

    @Override // tb.okc
    public void onItemMoved(int i2, int i3, int i4) {
        int i5;
        RecyclerView.ItemAnimator itemAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc595b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (((l) this.viewParams).X0) {
            if (i4 - i3 <= 1 || !S1()) {
                itemAnimator = this.t;
            } else {
                itemAnimator = null;
            }
            ((TNodeRecyclerView) this.view).setItemAnimator(itemAnimator);
        }
        z1();
        updateAPMToken(this.view, null);
        if ((i2 & 16) != 0) {
            i5 = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i5 = this.z + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        d27 d27Var = this.s;
        if (d27Var != null) {
            d27Var.onItemMoved(i2, i3 + i5, i4 + i5);
        }
    }

    @Override // tb.okc
    public void onItemRemoved(int i2, int i3, int i4) {
        int headerViewsCount;
        RecyclerView.ItemAnimator itemAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690cce8e", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (((l) this.viewParams).X0) {
            if (i4 <= 1 || !S1()) {
                itemAnimator = this.t;
            } else {
                itemAnimator = null;
            }
            ((TNodeRecyclerView) this.view).setItemAnimator(itemAnimator);
        }
        z1();
        updateAPMToken(this.view, null);
        if ((i2 & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i3 += this.z;
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        int i5 = i3 + headerViewsCount;
        d27 d27Var = this.s;
        if (d27Var != null) {
            d27Var.onItemRemoved(i2, i5, i4);
        }
    }

    @Override // tb.o3g
    public void onKeyBoardNeedDismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f037a573", new Object[]{this, context});
        } else {
            nwv.O(context);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        if (!((ArrayList) this.node.d).isEmpty()) {
            n nVar = (n) ((ArrayList) this.node.d).get(0);
            nVar.V0(Float.NaN, Float.NaN);
            this.z = 0;
            if (B1(nVar)[0] != null) {
                i2 = 1;
            }
            this.z = i2;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i2, i3, i4, i5, z);
        V v = this.view;
        if (v != 0 && i2 != i4 && !z) {
            try {
                RecyclerView.ItemDecoration itemDecorationAt = ((TNodeRecyclerView) v).getItemDecorationAt(0);
                if (itemDecorationAt instanceof ItemDecoration) {
                    ItemDecoration.a((ItemDecoration) itemDecorationAt, -1);
                }
            } catch (Throwable th) {
                tfs.g("ListViewComponent", "onLayoutChanged error " + th.getMessage());
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (!((ArrayList) this.node.d).isEmpty()) {
            n nVar = (n) ((ArrayList) this.node.d).get(0);
            if (((l) this.viewParams).x0) {
                this.w = A1();
            }
            n[] B1 = B1(nVar);
            N1().q(B1[0], B1[1], new i());
            nVar.W0();
            int size = ((ArrayList) nVar.d).size();
            if (size == 1) {
                n nVar2 = (n) ((ArrayList) nVar.d).get(0);
                if (nVar2.u0().u().equals("cells")) {
                    nVar2.W0();
                }
            } else if (size > 1) {
                ((n) ((ArrayList) nVar.d).get(1)).W0();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        return super.onPrepareComponent(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            return;
        }
        n nVar = (n) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
        boolean o = nwv.o(this.node.H("enabled-drag"), false);
        if (nVar != null && !o && !U1(viewHolder)) {
            Object tag = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_task_id);
            if (tag instanceof MessageQueue.IdleHandler) {
                Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler) tag);
            }
            Object tag2 = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_timeout_task_id);
            if (tag2 instanceof Runnable) {
                this.o.removeCallbacks((Runnable) tag2);
            }
            nVar.n(false);
        }
    }

    public void removeScrollStateListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e645988c", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.k;
        if (list != null) {
            ((ArrayList) list).remove(scrollChangeListener);
        }
        V v = this.view;
        if (v != 0) {
            ((TNodeRecyclerView) v).removeScrollChangeListener(scrollChangeListener);
        }
    }

    @Override // tb.sxo
    public void scrollBy(int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v == 0) {
            return;
        }
        if (z) {
            ((TNodeRecyclerView) v).smoothScrollBy(i2, i3);
        } else {
            ((TNodeRecyclerView) v).scrollBy(i2, i3);
        }
    }

    @Override // tb.sxo
    public void scrollTo(int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
        }
    }

    @Override // tb.sxo
    public void scrollToPosition(int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3)});
        } else {
            scrollToPositionWithNumber(i2, z, i3, 0);
        }
    }

    @Override // tb.sxo
    public void scrollToPositionWithNumber(int i2, boolean z, final int i3, final int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3), new Integer(i4)});
        } else if (this.view != 0 && this.y.d0(i2) != null) {
            SmoothScroller smoothScroller = new SmoothScroller(this, ((TNodeRecyclerView) this.view).getContext(), i3) { // from class: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass12 r6, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1207374993) {
                        return new Integer(super.calculateDtToFit(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
                    }
                    if (hashCode == -1142219598) {
                        return new Float(super.calculateSpeedPerPixel((DisplayMetrics) objArr[0]));
                    }
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$12");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateDtToFit(int i5, int i6, int i7, int i8, int i9) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)})).intValue();
                    }
                    if (i3 == 1) {
                        return (i7 + ((i8 - i7) / 2)) - (i5 + ((i6 - i5) / 2));
                    }
                    return super.calculateDtToFit(i5, i6, i7, i8, i9);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                    }
                    int i5 = i4;
                    if (i5 == 0) {
                        return super.calculateSpeedPerPixel(displayMetrics);
                    }
                    return (25.0f / i5) / displayMetrics.densityDpi;
                }
            };
            int headerViewsCount = i2 + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
            smoothScroller.setTargetPosition(headerViewsCount);
            if (z) {
                ((TNodeRecyclerView) this.view).getLayoutManager().startSmoothScroll(smoothScroller);
                return;
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.u;
            if (onGlobalLayoutListener != null) {
                ugw.b(this.view, onGlobalLayoutListener);
            }
            this.u = new c(headerViewsCount);
            ((TNodeRecyclerView) this.view).getViewTreeObserver().addOnGlobalLayoutListener(this.u);
            ((TNodeRecyclerView) this.view).getLayoutManager().scrollToPosition(headerViewsCount);
        }
    }

    public final void sendMessageToVisibleItem(String str, Map map, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e715418", new Object[]{this, str, map, new Boolean(z), new Integer(i2)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int[] findVisibleItemPositionRange = ((TNodeRecyclerView) v).findVisibleItemPositionRange(true);
            int i3 = findVisibleItemPositionRange[0];
            if (i3 >= 0 || findVisibleItemPositionRange[1] >= 0 || !z) {
                while (i3 <= findVisibleItemPositionRange[1] && i3 >= 0) {
                    sendMessage(i2, this.y.d0(i3), str, null, map, null);
                    i3++;
                }
                return;
            }
            nwv.y0(new f(i2, str, map));
        }
    }

    public void setPatchTriggerName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3857e4e", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public final void setupPullUpStatus(boolean z) {
        DragToRefreshFeature dragToRefreshFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9403599e", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean[] checkHasMoreStatus = checkHasMoreStatus();
        if (!z) {
            DragToRefreshFeature dragToRefreshFeature2 = this.d;
            if (dragToRefreshFeature2 != null) {
                dragToRefreshFeature2.setNegativeRefreshFinish(true ^ checkHasMoreStatus[1]);
            }
        } else if (this.node.t0() != null && checkHasMoreStatus[0] && (dragToRefreshFeature = this.d) != null) {
            dragToRefreshFeature.setNegativeRefreshFinish(true ^ checkHasMoreStatus[1]);
        }
    }

    @Override // tb.lkc
    public void updateListChangedEvent(int i2, int i3, int i4, boolean z, n nVar) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2ba66d", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), nVar});
            return;
        }
        this.r.a(i2, i3, i4, z);
        if ((i2 & 1) != 0) {
            com.taobao.tao.flexbox.layoutmanager.component.b N1 = N1();
            if ((i2 & 16) != 0) {
                z2 = true;
            }
            N1.p(nVar, i3, z2);
        } else if ((i2 & 2) != 0) {
            N1().d(nVar, i3);
        }
    }

    public void v1(w2w w2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6edbdf", new Object[]{this, w2wVar});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((TNodeRecyclerView) v).addVelocityChangeListener(w2wVar);
        }
    }

    public final JSONArray x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9a378ef1", new Object[]{this});
        }
        n[] B1 = B1((n) ((ArrayList) this.node.d).get(0));
        n nVar = B1[0];
        n nVar2 = B1[1];
        JSONArray jSONArray = new JSONArray();
        if (nVar != null) {
            try {
                jSONArray.put(y1(nVar));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (nVar2 != null) {
            Iterator it = ((ArrayList) nVar2.d).iterator();
            while (it.hasNext()) {
                jSONArray.put(y1((n) it.next()));
            }
        }
        return jSONArray;
    }

    public final org.json.JSONObject y1(n nVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("1214083f", new Object[]{this, nVar});
        }
        n L1 = L1(nVar);
        if (L1 == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        rbi S = L1.S();
        if (S != null) {
            jSONObject.put("width", s6o.K(this.node, ((TNodeRecyclerView) this.view).getContext(), S.f27261a));
            jSONObject.put("height", s6o.K(this.node, ((TNodeRecyclerView) this.view).getContext(), S.b));
        }
        jSONObject.put("id", L1.H("record-id"));
        jSONObject.put("type", L1.H("record-type"));
        jSONObject.put("title", L1.H("record-title"));
        jSONObject.put("pic", L1.H("record-pic"));
        return jSONObject;
    }

    public void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edb1716", new Object[]{this});
            return;
        }
        this.f.clear();
        this.g.clear();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A0;
        public int B0;
        public String C0;
        public String D0;
        public String E0;
        public String F0;
        public int G0;
        public String H0;
        public String I0;
        public boolean J0;
        public int L0;
        public String O0;
        public boolean P0;
        public String R0;
        public boolean S0;
        public int T0;
        public String U0;
        public Drawable W0;
        public boolean X0;
        public boolean Y0;
        public float Z0;
        public boolean x0;
        public int y0;
        public int w0 = 1;
        public int z0 = Integer.MAX_VALUE;
        public int K0 = 1;
        public boolean M0 = true;
        public boolean N0 = false;
        public boolean Q0 = true;
        public boolean V0 = false;
        public boolean a1 = true;

        static {
            t2o.a(503316754);
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$ListParams");
        }

        public final void I(Context context, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a0c56ee", new Object[]{this, context, map});
                return;
            }
            Object obj = map.get("columns");
            if (obj != null) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith("auto")) {
                        this.x0 = true;
                        String[] split = str.split(" ");
                        if (str.contains("minsize")) {
                            if (split.length > 1) {
                                String[] split2 = split[1].split(":");
                                if (split2.length == 2) {
                                    this.y0 = s6o.V(g(), context, split2[1]);
                                }
                            }
                            if (split.length > 2) {
                                this.z0 = nwv.t(split[2], Integer.MAX_VALUE);
                                return;
                            }
                            return;
                        }
                        IDeviceInfo i = od0.D().i();
                        if (!(context instanceof Activity)) {
                            context = od0.D().f().a();
                        }
                        int o = i.o((Activity) context);
                        if (split.length == 1) {
                            this.w0 = new int[]{2, 2, 4, 5, 5}[o];
                            return;
                        } else if (split.length == 6) {
                            this.w0 = nwv.t(split[o + 1], 1);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                this.x0 = false;
                this.y0 = 0;
                this.w0 = nwv.t(obj, 1);
            }
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            I(context, hashMap);
            int U = s6o.U(g(), context, nwv.t(hashMap.get("preLoadHeight"), 0));
            this.G0 = U;
            if (U <= 0) {
                this.G0 = s6o.U(g(), context, nwv.t(hashMap.get("preload-height"), 0));
            }
            nwv.I(hashMap.get("onscrollstatechanged"), null);
            this.D0 = nwv.I(hashMap.get("onbegindragging"), null);
            this.E0 = nwv.I(hashMap.get("onenddragging"), null);
            this.F0 = nwv.I(hashMap.get("onscroll"), null);
            this.H0 = nwv.I(hashMap.get("onrefresh"), null);
            this.I0 = nwv.I(hashMap.get("onloading"), null);
            int U2 = s6o.U(g(), context, nwv.t(hashMap.get("space"), 0));
            this.B0 = U2;
            this.A0 = U2;
            int t = nwv.t(hashMap.get("row-space"), 0);
            if (t > 0) {
                this.A0 = s6o.U(g(), context, t);
            }
            int t2 = nwv.t(hashMap.get("column-space"), 0);
            if (t2 > 0) {
                this.B0 = s6o.U(g(), context, t2);
            }
            this.C0 = (String) hashMap.get("mode");
            this.J0 = nwv.o(hashMap.get(TypedValues.TransitionType.S_STAGGERED), false);
            this.K0 = hashMap.containsKey("refresh-text-color") ? ir2.e(context, 0, hashMap.get("refresh-text-color")) : 1;
            this.Z0 = nwv.r(hashMap.get("refresh-triggle-percent"), 0);
            this.N0 = nwv.o(hashMap.get("enabled-drag"), false);
            this.O0 = nwv.I(hashMap.get("ondrag"), null);
            nwv.I(hashMap.get("onselectchanged"), null);
            this.P0 = nwv.o(hashMap.get("enabled-drag-alpha"), false);
            this.M0 = nwv.o(hashMap.get("clip-padding"), true);
            nwv.I(hashMap.get("reload-animation"), null);
            jfw.G(g(), context, hashMap.get("min-page-offset"));
            jfw.G(g(), context, hashMap.get("min-pageup-offset"));
            jfw.G(g(), context, hashMap.get("min-pagedown-offset"));
            nwv.t(hashMap.get("min-page-speed"), 5000);
            jfw.G(g(), context, hashMap.get("cell-offset"));
            this.L0 = jfw.G(g(), context, hashMap.get(ScrollViewComponent.n.MAX_REFRESH_DISTANCE));
            this.Q0 = nwv.o(hashMap.get("bounces"), true);
            this.R0 = nwv.I(hashMap.get("keyboard-dismiss-mode"), null);
            this.Y0 = nwv.o(hashMap.get("listPreload"), false);
            this.S0 = nwv.o(hashMap.get("barrage"), false);
            this.T0 = nwv.t(hashMap.get("speed-per-width"), 0);
            this.U0 = nwv.I(hashMap.get("barrage-state"), null);
            this.V0 = nwv.o(hashMap.get("nested-slide"), false);
            this.X0 = nwv.o(hashMap.get("ignore-item-animator"), false);
            this.a1 = nwv.o(hashMap.get("scroll"), true);
            String I = nwv.I(hashMap.get("placeholder"), null);
            if (!TextUtils.isEmpty(I) && akt.r2() > 0) {
                try {
                    int identifier = context.getResources().getIdentifier(I, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
                    if (identifier > 0) {
                        this.W0 = context.getResources().getDrawable(identifier);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        V v;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        N1().c();
        V v2 = this.view;
        if (!(v2 == 0 || (onGlobalLayoutListener = this.u) == null)) {
            ugw.b(v2, onGlobalLayoutListener);
            this.u = null;
        }
        sendMessageToVisibleItem("onwilldisappear", new HashMap(), false, 34);
        if (akt.a0() && (v = this.view) != 0) {
            ((TNodeRecyclerView) v).setAdapter(null);
            this.y = null;
        }
        super.detach(z);
        BottomSheetComponentInterface bottomSheetComponentInterface = this.j;
        if (bottomSheetComponentInterface != null) {
            bottomSheetComponentInterface.removeBottomSheetStateChangedListener(this);
            this.j = null;
        }
        List<ScrollChangeListener> list = this.k;
        if (list != null) {
            ((ArrayList) list).clear();
        }
    }

    public void loadMore() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (!this.B && (str = (String) this.node.H("onloading")) != null) {
            this.B = true;
            sendMessage(this.node, "onloading", str, null, new b());
            this.x.removeMessages(1);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.x.sendMessageDelayed(Message.obtain(this.x, 1, str), 5000L);
        }
    }

    public void E1(int i2, int i3, int i4, float f2, int i5, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49917998", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Float(f2), new Integer(i5), new Float(f3)});
            return;
        }
        if (!this.D) {
            int totalX = ((TNodeRecyclerView) this.view).getTotalX();
            int totalY = ((TNodeRecyclerView) this.view).getTotalY();
            HashMap hashMap = new HashMap();
            hashMap.put("firstIndex", Integer.valueOf(i2));
            hashMap.put(pg1.ATOM_lastIndex, Integer.valueOf(i3));
            hashMap.put("totalX", Integer.valueOf(totalX));
            hashMap.put("totalY", Integer.valueOf(totalY));
            hashMap.put("dy", Integer.valueOf(i4));
            hashMap.put("mDy", Float.valueOf(f2));
            hashMap.put("scrollState", Integer.valueOf(i5));
            hashMap.put("group", this.h);
            hashMap.put("moveY", Float.valueOf(f3));
            hashMap.put("offsetX", Integer.valueOf(s6o.K(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalX)));
            hashMap.put("offsetY", Integer.valueOf(s6o.K(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalY)));
            if (((l) this.viewParams).F0 == null || !akt.t1()) {
                sendMessage(512, getNode(), "onscroll", null, hashMap, null);
            } else {
                sendMessage(getNode(), "onscroll", null, hashMap, null);
            }
        }
        this.D = false;
    }

    public final void R1(Class<?> cls) {
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            ztn.b(newInstance, "targetRecycleView", new Object[]{this.view}, RecyclerView.class);
            ztn.b(newInstance, "context", new Object[]{((TNodeRecyclerView) this.view).getContext()}, Context.class);
            this.G = (vhd) ztn.a(newInstance, CartRecommendRefreshScene.build);
            this.node.P().y1(R.id.layout_manager_recorder_tag, this.G);
            this.G.start();
            this.G.appear();
            this.G.refresh(x1());
            this.I.o(this);
        } catch (Throwable th) {
            tfs.e("ListViewComponent", "create Recorder instance fail " + th.getMessage());
        }
    }

    /* renamed from: V1 */
    public TNodeRecyclerView onCreateView(Context context) {
        n y;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("132de439", new Object[]{this, context});
        }
        final TNodeRecyclerView tNodeRecyclerView = new TNodeRecyclerView(context);
        this.s = new d27("list", tNodeRecyclerView);
        YogaFlexDirection yogaFlexDirection = ((l) this.viewParams).v;
        YogaFlexDirection yogaFlexDirection2 = YogaFlexDirection.COLUMN;
        int i2 = yogaFlexDirection == yogaFlexDirection2 ? 1 : 0;
        if (!(i2 == 0 || (y = this.node.y("scrollView", 1)) == null || !(y.w0() instanceof TBSwipeRefreshLayout))) {
            ((l) this.viewParams).Q0 = false;
        }
        this.m = akt.y2(((l) this.viewParams).Y0);
        l lVar = (l) this.viewParams;
        if (lVar.N0) {
            lVar.Q0 = false;
        }
        if (lVar.Q0) {
            tNodeRecyclerView.enableEdgeEffect(lVar.v == yogaFlexDirection2 ? 1 : 0);
        }
        tNodeRecyclerView.setKeyBoardDismissMode(((l) this.viewParams).R0);
        tNodeRecyclerView.setKeyBoardDismissListener(this);
        tNodeRecyclerView.setComponent(this);
        tNodeRecyclerView.setRecyclerListener(this);
        this.t = tNodeRecyclerView.getItemAnimator();
        if (gz0.d() || ((l) this.viewParams).X0) {
            tNodeRecyclerView.setItemAnimator(null);
        }
        if (tNodeRecyclerView.getItemAnimator() != null) {
            tNodeRecyclerView.getItemAnimator().setChangeDuration(0L);
        }
        if (i2 != 0) {
            n y2 = this.node.y("TabBarController", 1);
            if (!(y2 == null || y2.K() == null)) {
                this.h = ((TabBarControllerComponent) y2.K()).getViewParams().y0;
            }
            n z2 = this.node.z(BottomSheetComponentInterface.class, null, true);
            if (z2 != null && akt.o()) {
                BottomSheetComponentInterface bottomSheetComponentInterface = (BottomSheetComponentInterface) z2.K();
                this.j = bottomSheetComponentInterface;
                bottomSheetComponentInterface.addBottomSheetStateChangedListener(this);
            }
        }
        if (((l) this.viewParams).N0) {
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r11, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -596902942:
                            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
                            return null;
                        case 681460478:
                            return new Integer(super.interpolateOutOfBoundsScroll((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).longValue()));
                        case 1666624894:
                            super.onSelectedChanged((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        case 1850426492:
                            super.onMoved((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1], ((Number) objArr[2]).intValue(), (RecyclerView.ViewHolder) objArr[3], ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue());
                            return null;
                        default:
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$3");
                    }
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc6bfbe2", new Object[]{this, recyclerView, viewHolder});
                        return;
                    }
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setAlpha(1.0f);
                    ((TNodeRecyclerView) recyclerView).setHookTouchEvent(true);
                    ListViewComponent listViewComponent = ListViewComponent.this;
                    View b1 = ListViewComponent.b1(listViewComponent, listViewComponent.getView());
                    if (b1 != null) {
                        b1.setZ(0.0f);
                    }
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("60866505", new Object[]{this, recyclerView, viewHolder})).intValue();
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i3, int i4, int i5, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("289e42fe", new Object[]{this, recyclerView, new Integer(i3), new Integer(i4), new Integer(i5), new Long(j2)})).intValue();
                    }
                    int interpolateOutOfBoundsScroll = super.interpolateOutOfBoundsScroll(recyclerView, i3, i4, i5, j2);
                    if (interpolateOutOfBoundsScroll == 1 || interpolateOutOfBoundsScroll == -1) {
                        return 0;
                    }
                    return interpolateOutOfBoundsScroll;
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public boolean isLongPressDragEnabled() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3ec6018c", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
                    }
                    return true;
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i3, RecyclerView.ViewHolder viewHolder2, int i4, int i5, int i6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e4b447c", new Object[]{this, recyclerView, viewHolder, new Integer(i3), viewHolder2, new Integer(i4), new Integer(i5), new Integer(i6)});
                        return;
                    }
                    super.onMoved(recyclerView, viewHolder, i3, viewHolder2, i4, i5, i6);
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    n nVar = (n) viewHolder2.itemView.getTag(R.id.layout_manager_cell_tag_id);
                    if (nVar != null && nwv.o(nVar.H("enabled-drag"), false)) {
                        ListViewComponent.s0(ListViewComponent.this).notifyItemMoved(adapterPosition, adapterPosition2);
                        ListViewComponent.O0(ListViewComponent.this, adapterPosition - (ListViewComponent.D0(ListViewComponent.this) + tNodeRecyclerView.getHeaderViewsCount()), adapterPosition2 - (ListViewComponent.D0(ListViewComponent.this) + tNodeRecyclerView.getHeaderViewsCount()));
                    }
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fc91c0af", new Object[]{this, viewHolder, new Integer(i3)});
                    }
                }

                @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6356ad7e", new Object[]{this, viewHolder, new Integer(i3)});
                        return;
                    }
                    if (i3 == 2) {
                        if (((l) ListViewComponent.m1(ListViewComponent.this)).P0) {
                            viewHolder.itemView.setAlpha(0.9f);
                        }
                    } else if (i3 == 0 && ListViewComponent.j(ListViewComponent.this) != ListViewComponent.t(ListViewComponent.this) && !TextUtils.isEmpty(((l) ListViewComponent.E(ListViewComponent.this)).O0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("source", Integer.valueOf(ListViewComponent.j(ListViewComponent.this)));
                        hashMap.put("dest", Integer.valueOf(ListViewComponent.t(ListViewComponent.this)));
                        ListViewComponent listViewComponent = ListViewComponent.this;
                        listViewComponent.postMessage(ListViewComponent.G(listViewComponent), "ondrag", null, hashMap, null);
                    }
                    super.onSelectedChanged(viewHolder, i3);
                }
            });
            this.f12038a = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(tNodeRecyclerView);
        }
        l lVar2 = (l) this.viewParams;
        if (lVar2.w0 == 1) {
            CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(context);
            if (((l) this.viewParams).v == YogaFlexDirection.ROW) {
                customLinearLayoutManager.setOrientation(0);
            }
            tNodeRecyclerView.setLayoutManager(customLinearLayoutManager);
        } else {
            if (!lVar2.S0) {
                tNodeRecyclerView.addItemDecoration(new ItemDecoration(this, null));
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$4");
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i3)})).intValue();
                    }
                    int i4 = ListViewComponent.H(ListViewComponent.this).get(i3, -1);
                    if (i4 != -1) {
                        return i4;
                    }
                    n d0 = ListViewComponent.s0(ListViewComponent.this).d0(i3);
                    if (d0 == null) {
                        return ((l) ListViewComponent.I(ListViewComponent.this)).w0;
                    }
                    if (ListViewComponent.this.b2(d0)) {
                        ListViewComponent.H(ListViewComponent.this).put(i3, ((l) ListViewComponent.J(ListViewComponent.this)).w0);
                        return ((l) ListViewComponent.K(ListViewComponent.this)).w0;
                    }
                    ListViewComponent.H(ListViewComponent.this).put(i3, 1);
                    return 1;
                }
            };
            spanSizeLookup.setSpanIndexCacheEnabled(true);
            this.e = spanSizeLookup;
            if (((l) this.viewParams).J0) {
                CustomStaggeredGridLayoutManager customStaggeredGridLayoutManager = new CustomStaggeredGridLayoutManager(((l) this.viewParams).w0, i2, tNodeRecyclerView);
                customStaggeredGridLayoutManager.setSpanSizeLookup(spanSizeLookup);
                if (((l) this.viewParams).S0) {
                    tNodeRecyclerView.setDisableTouch(true);
                    customStaggeredGridLayoutManager.B(((l) this.viewParams).T0);
                }
                tNodeRecyclerView.setLayoutManager(customStaggeredGridLayoutManager);
            } else {
                CustomGridLayoutManager customGridLayoutManager = new CustomGridLayoutManager(context, ((l) this.viewParams).w0);
                customGridLayoutManager.setSpanSizeLookup(spanSizeLookup);
                tNodeRecyclerView.setLayoutManager(customGridLayoutManager);
            }
        }
        if (i2 != 0) {
            DragToRefreshFeature dragToRefreshFeature = this.d;
            if (dragToRefreshFeature == null || dragToRefreshFeature.getContext() != context) {
                this.d = new DragToRefreshFeature(context, 1);
                a2(true);
                tNodeRecyclerView.addFeature(this.d);
            }
            DragToRefreshFeature dragToRefreshFeature2 = this.d;
            if (((l) this.viewParams).H0 != null) {
                z = true;
            }
            dragToRefreshFeature2.enablePositiveDrag(z);
            this.d.setMaxPullDistance(((l) this.viewParams).L0);
            if (((l) this.viewParams).I0 != null) {
                DragToRefreshFeature dragToRefreshFeature3 = this.d;
                if (dragToRefreshFeature3 == null || dragToRefreshFeature3.getContext() != context) {
                    this.d = new DragToRefreshFeature(context, 1);
                    a2(true);
                    tNodeRecyclerView.addFeature(this.d);
                }
                this.d.enableNegativeDrag(true, R.string.tnode_uik_refresh_arrow, null, ((l) this.viewParams).Z0);
                this.d.setNegativeTips(new String[]{"上拉加载更多内容", "松开加载...", "正在加载...", "数据加载完毕"});
                this.d.setNegativeDragAuto(true);
                setupPullUpStatus(true);
            }
        }
        if (!nwv.h0()) {
            tNodeRecyclerView.setOverScrollMode(1);
        }
        List<ScrollChangeListener> list = this.k;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                tNodeRecyclerView.addScrollChangeListener((ScrollChangeListener) it.next());
            }
            ((ArrayList) this.k).clear();
        }
        tNodeRecyclerView.addVelocityChangeListener(new g());
        return tNodeRecyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r10, java.lang.String r11, com.alibaba.fastjson.JSONObject r12, com.taobao.tao.flexbox.layoutmanager.ac.d.k r13) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "9f789b95"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r9
            r4[r0] = r10
            r10 = 2
            r4[r10] = r11
            r10 = 3
            r4[r10] = r12
            r10 = 4
            r4[r10] = r13
            java.lang.Object r10 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0025:
            V extends android.view.View r2 = r9.view
            if (r2 == 0) goto L_0x008c
            r11.hashCode()
            java.lang.String r2 = "scrollToPosition"
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x008c
        L_0x0036:
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1
            if (r12 == 0) goto L_0x0065
            java.lang.String r1 = "position"
            int r1 = r12.getIntValue(r1)
            java.lang.String r4 = "animated"
            boolean r4 = r12.getBooleanValue(r4)
            java.lang.String r5 = "speedRatio"
            float r5 = r12.getFloatValue(r5)
            java.lang.String r6 = "stage"
            boolean r7 = r12.containsKey(r6)
            if (r7 == 0) goto L_0x0061
            int r3 = r12.getIntValue(r6)
            r8 = r3
            r3 = r1
            r1 = r4
            r4 = r8
            goto L_0x0069
        L_0x0061:
            r3 = r1
            r1 = r4
            r4 = -1
            goto L_0x0069
        L_0x0065:
            r3 = 0
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0069:
            r6 = 0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r5
        L_0x0070:
            if (r1 == 0) goto L_0x0088
            if (r4 < 0) goto L_0x0084
            r9.Z1(r4)
            V extends android.view.View r1 = r9.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r1 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView) r1
            com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent$d r4 = new com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent$d
            r4.<init>(r3, r2)
            r1.post(r4)
            goto L_0x008d
        L_0x0084:
            r9.c2(r3, r2)
            goto L_0x008d
        L_0x0088:
            r9.Z1(r3)
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 != 0) goto L_0x0093
            boolean r0 = super.invoke(r10, r11, r12, r13)
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    public void pullRefresh(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff8b788", new Object[]{this, map});
        } else if (!this.C) {
            String str = (String) this.node.H("onrefresh");
            if (str != null) {
                this.C = true;
                sendMessage(this.node, "onrefresh", str, map, new a());
                this.x.removeMessages(0);
                if (str.startsWith("$://")) {
                    str = str.substring(4);
                }
                this.x.sendMessageDelayed(Message.obtain(this.x, 0, str), 5000L);
            }
            ((TNodeRecyclerView) this.view).resetTotal();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyAttrForView(com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r6, com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.l r7, java.util.Map r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.applyAttrForView(com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView, com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent$l, java.util.Map, boolean):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12041a;
        public int b;
        public int c;

        static {
            t2o.a(503316753);
        }

        public ItemDecoration() {
            this.f12041a = -1;
            this.b = -1;
            this.c = -1;
        }

        public static /* synthetic */ int a(ItemDecoration itemDecoration, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2df2de65", new Object[]{itemDecoration, new Integer(i)})).intValue();
            }
            itemDecoration.c = i;
            return i;
        }

        public static /* synthetic */ Object ipc$super(ItemDecoration itemDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ListViewComponent$ItemDecoration");
        }

        public final int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("722028cc", new Object[]{this, new Integer(i)})).intValue();
            }
            int i2 = ListViewComponent.F0(ListViewComponent.this).get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = i - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                if (ListViewComponent.H(ListViewComponent.this).get(i4) == ((l) ListViewComponent.G0(ListViewComponent.this)).w0) {
                    int i5 = (i3 - i4) % ((l) ListViewComponent.H0(ListViewComponent.this)).w0;
                    if (i5 == ((l) ListViewComponent.I0(ListViewComponent.this)).w0 - 1) {
                        ListViewComponent.F0(ListViewComponent.this).put(i, 2);
                        return 2;
                    } else if (i5 == 0) {
                        ListViewComponent.F0(ListViewComponent.this).put(i, 0);
                        return 0;
                    } else {
                        ListViewComponent.F0(ListViewComponent.this).put(i, 1);
                        return 1;
                    }
                }
            }
            int i6 = i % ((l) ListViewComponent.J0(ListViewComponent.this)).w0;
            if (i6 == ((l) ListViewComponent.K0(ListViewComponent.this)).w0 - 1) {
                ListViewComponent.F0(ListViewComponent.this).put(i, 2);
                return 2;
            } else if (i6 == 0) {
                ListViewComponent.F0(ListViewComponent.this).put(i, 0);
                return 0;
            } else {
                ListViewComponent.F0(ListViewComponent.this).put(i, 1);
                return 1;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
            if ((r13.getChildAt(0) instanceof com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.FakeHeaderView) == false) goto L_0x0039;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getItemOffsets(android.graphics.Rect r10, android.view.View r11, androidx.recyclerview.widget.RecyclerView r12, androidx.recyclerview.widget.RecyclerView.State r13) {
            /*
                Method dump skipped, instructions count: 859
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent.ItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
        }

        public /* synthetic */ ItemDecoration(ListViewComponent listViewComponent, e eVar) {
            this();
        }
    }

    public void F1(int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e6b150", new Object[]{this, new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i2));
        int totalX = ((TNodeRecyclerView) this.view).getTotalX();
        int totalY = ((TNodeRecyclerView) this.view).getTotalY();
        hashMap.put("totalX", Integer.valueOf(totalX));
        hashMap.put("totalY", Integer.valueOf(totalY));
        hashMap.put("offsetX", Integer.valueOf(s6o.K(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalX)));
        hashMap.put("offsetY", Integer.valueOf(s6o.K(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalY)));
        if (i2 == 0) {
            ArrayList arrayList = new ArrayList();
            int[] findVisibleItemPositionRange = ((TNodeRecyclerView) this.view).findVisibleItemPositionRange(true);
            for (int i4 = findVisibleItemPositionRange[0]; i4 <= findVisibleItemPositionRange[1] && i4 >= 0; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            hashMap.put("indexs", arrayList);
            int totalY2 = ((TNodeRecyclerView) this.view).getTotalY() - this.A;
            if (totalY2 != 0) {
                i3 = totalY2 > 0 ? 1 : 2;
            }
            hashMap.put("slide", Integer.valueOf(i3));
            ((TNodeRecyclerView) this.view).getTotalX();
            this.A = ((TNodeRecyclerView) this.view).getTotalY();
        }
        postMessage(this.node, "onscrollstatechanged", null, hashMap, null);
        if (i2 == 0) {
            if (((l) this.viewParams).E0 != null) {
                postMessage(this.node, "onenddragging", null, null, null);
            }
            if (akt.w0("idlestate")) {
                sendMessage(2, this.node, "scroll_state_idle_internal", null, null, null);
            }
        } else if (i2 == 1 && ((l) this.viewParams).D0 != null) {
            postMessage(this.node, "onbegindragging", null, null, null);
        }
    }
}
