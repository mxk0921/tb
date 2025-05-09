package com.alibaba.android.ultron.vfw.core;

import android.content.Context;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.perf.rebuilddelay.UltronViewRebuildDelayTask;
import com.alibaba.android.ultron.vfw.perf.rebuilddelay.UltronViewRebuildDelayType;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.uc.webview.export.media.CommandID;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.aae;
import tb.bsb;
import tb.epk;
import tb.et6;
import tb.fce;
import tb.gsb;
import tb.h3x;
import tb.hav;
import tb.i7v;
import tb.jc4;
import tb.jo7;
import tb.kav;
import tb.lbv;
import tb.lq3;
import tb.mqk;
import tb.o58;
import tb.onq;
import tb.p9v;
import tb.pav;
import tb.ppi;
import tb.qbe;
import tb.r8v;
import tb.rew;
import tb.rfw;
import tb.rjc;
import tb.rq3;
import tb.sh4;
import tb.svk;
import tb.t2o;
import tb.twl;
import tb.ucv;
import tb.ujt;
import tb.vav;
import tb.vcv;
import tb.vv;
import tb.x17;
import tb.xit;
import tb.xur;
import tb.yxr;
import tb.z7v;
import tb.z9e;
import tb.z9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 127;
    public static final int BACKGROUND = 32;
    public static final int BODY = 2;
    public static final int FOOTER = 4;
    public static final int FOREGROUND = 64;
    public static final int HEADER = 1;
    public static final String KEY_VIEW_ENGINE = "ViewEngine";
    public static final int STICKY_BOTTOM = 16;
    public static final int STICKY_TOP = 8;
    public static final String TAG = "ViewEngine";
    public static final int TYPE_REFRESH_AFTER_DOWNLOAD = 2;
    public static final int TYPE_REFRESH_NEXT_CREATE = 1;
    public static boolean f0;
    public final Map<String, Object> A;
    public final jo7 B;
    public Map<String, qbe> C;
    public final String D;
    public int E;
    public int F;
    public final twl G;
    public int H;
    public int I;
    public final ppi J;
    public final Map<String, bsb> K;
    public Set<RecyclerView.OnScrollListener> L;
    public rjc M;
    public boolean N;
    public int P;
    public String Q;
    public int R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public Context f2315a;
    public UltronViewRebuildDelayTask a0;
    public final z7v b;
    public r8v b0;
    public RecyclerViewAdapter c;
    public xit c0;
    public RecyclerView d;
    public ucv d0;
    public ViewGroup e;
    public kav e0;
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public et6 i;
    public final rew j;
    public final h3x k;
    public final ujt l;
    public final Map<Class<?>, Object> m;
    public final List<RecyclerViewHolder> n;
    public final List<RecyclerViewHolder> o;
    public RecyclerViewHolder p;
    public RecyclerViewHolder q;
    public IDMComponent r;
    public onq s;
    public onq t;
    public boolean u;
    public int v;
    public final int w;
    public RecyclerViewHolder x;
    public RecyclerViewHolder y;
    public final String z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.vfw.core.ViewEngine$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0074a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0074a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    yxr.d(ViewEngine.a(ViewEngine.this));
                }
            }
        }

        public a() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (pav.b()) {
                pav.l(new RunnableC0074a(), vav.f("newUltron_container", "ultronZCachePrefetchDelayMills", 1000L));
            } else {
                yxr.d(ViewEngine.a(ViewEngine.this));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends onq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ViewGroup viewGroup, rew rewVar) {
            super(viewGroup, rewVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/core/ViewEngine$3");
        }

        @Override // tb.onq
        public List<IDMComponent> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("9af405ee", new Object[]{this});
            }
            return ViewEngine.d(ViewEngine.this).j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends onq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(ViewGroup viewGroup, rew rewVar) {
            super(viewGroup, rewVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/core/ViewEngine$4");
        }

        @Override // tb.onq
        public List<IDMComponent> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("9af405ee", new Object[]{this});
            }
            return ViewEngine.d(ViewEngine.this).i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2319a;
        public final /* synthetic */ vcv b;

        public d(int i, vcv vcvVar) {
            this.f2319a = i;
            this.b = vcvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ViewEngine.e(ViewEngine.this, this.f2319a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2320a;
        public final /* synthetic */ vcv b;

        public e(int i, vcv vcvVar) {
            this.f2320a = i;
            this.b = vcvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewEngine.f(ViewEngine.this, this.f2320a, this.b);
            ViewEngine.g(ViewEngine.this, this.f2320a);
            hav.d("ViewEngine", "#滚动停止，恢复更新Header和Footer");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            try {
                if (ViewEngine.h(ViewEngine.this).getViewTreeObserver() != null) {
                    ViewEngine.h(ViewEngine.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                ViewEngine.i(ViewEngine.this);
            } catch (Throwable th) {
                UnifyLog.m("ViewEngine", "组件是否显示初始化", th.getMessage(), new String[0]);
            }
        }
    }

    static {
        t2o.a(157286581);
        t2o.a(157286576);
    }

    public ViewEngine(Context context) {
        this(context, "ultron");
    }

    public static /* synthetic */ String a(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e83fa82f", new Object[]{viewEngine});
        }
        return viewEngine.D;
    }

    public static /* synthetic */ Set b(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("4f2cfa41", new Object[]{viewEngine});
        }
        return viewEngine.L;
    }

    public static /* synthetic */ void c(ViewEngine viewEngine, LinearLayoutManager linearLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdd112c", new Object[]{viewEngine, linearLayoutManager, new Integer(i)});
        } else {
            viewEngine.e0(linearLayoutManager, i);
        }
    }

    public static /* synthetic */ et6 d(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("22c5a431", new Object[]{viewEngine});
        }
        return viewEngine.i;
    }

    public static /* synthetic */ void e(ViewEngine viewEngine, int i, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358b9250", new Object[]{viewEngine, new Integer(i), vcvVar});
        } else {
            viewEngine.B(i, vcvVar);
        }
    }

    public static /* synthetic */ void f(ViewEngine viewEngine, int i, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea298ef", new Object[]{viewEngine, new Integer(i), vcvVar});
        } else {
            viewEngine.G0(i, vcvVar);
        }
    }

    public static /* synthetic */ void g(ViewEngine viewEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8daa2bf", new Object[]{viewEngine, new Integer(i)});
        } else {
            viewEngine.E0(i);
        }
    }

    public static /* synthetic */ RecyclerView h(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c41bc9ec", new Object[]{viewEngine});
        }
        return viewEngine.d;
    }

    public static /* synthetic */ void i(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2b9346", new Object[]{viewEngine});
        } else {
            viewEngine.g0();
        }
    }

    public static /* synthetic */ boolean j(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5f00b17", new Object[]{viewEngine})).booleanValue();
        }
        return viewEngine.u;
    }

    public static /* synthetic */ int k(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff446047", new Object[]{viewEngine})).intValue();
        }
        return viewEngine.v;
    }

    public static /* synthetic */ RecyclerViewHolder l(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("67386844", new Object[]{viewEngine});
        }
        return viewEngine.x;
    }

    public static /* synthetic */ void m(ViewEngine viewEngine, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4ad979", new Object[]{viewEngine, recyclerViewHolder});
        } else {
            viewEngine.w1(recyclerViewHolder);
        }
    }

    public static /* synthetic */ void n(ViewEngine viewEngine, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f902fa", new Object[]{viewEngine, recyclerViewHolder});
        } else {
            viewEngine.f0(recyclerViewHolder);
        }
    }

    public static /* synthetic */ int o(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a495b54b", new Object[]{viewEngine})).intValue();
        }
        return viewEngine.w;
    }

    public static /* synthetic */ RecyclerViewHolder p(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("3f90f1c0", new Object[]{viewEngine});
        }
        return viewEngine.y;
    }

    public static /* synthetic */ boolean q(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73e5fde", new Object[]{viewEngine})).booleanValue();
        }
        return viewEngine.Y;
    }

    public final void A(List<IDMComponent> list, String str, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcdbbe9", new Object[]{this, list, str, vcvVar});
        } else {
            G().j(this.f2315a, this.d, this.c, list, str, x1(vcvVar));
        }
    }

    public final void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31233b0", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null && this.i != null) {
            viewGroup.removeAllViews();
            this.q = null;
            IDMComponent b2 = this.i.b();
            if (b2 != null) {
                RecyclerViewHolder c2 = this.j.c(this.g, this.j.f(b2));
                View view = c2.itemView;
                if (view != null) {
                    this.g.addView(view);
                    this.q = c2;
                }
                this.j.b(c2, b2);
            }
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a8798", new Object[]{this});
        } else {
            D(null);
        }
    }

    public final void C0(int i, List<IDMComponent> list, boolean z, String str, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe44a1d", new Object[]{this, new Integer(i), list, new Boolean(z), str, vcvVar});
        } else if ((i & 2) != 0 && list != null) {
            if (z) {
                A(list, str, vcvVar);
            } else {
                D0(list);
            }
        }
    }

    public final void D0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6351b55", new Object[]{this, list});
            return;
        }
        RecyclerViewAdapter recyclerViewAdapter = this.c;
        if (recyclerViewAdapter != null) {
            recyclerViewAdapter.getItemCount();
        }
        rjc rjcVar = this.M;
        if (rjcVar == null || !rjcVar.b()) {
            RecyclerViewAdapter recyclerViewAdapter2 = this.c;
            if (recyclerViewAdapter2 != null) {
                recyclerViewAdapter2.setData(list);
            }
        } else {
            this.M.d(this.i);
            rjc rjcVar2 = this.M;
            if ((rjcVar2 instanceof vv) && ((vv) rjcVar2).f()) {
                return;
            }
        }
        RecyclerViewAdapter recyclerViewAdapter3 = this.c;
        if (recyclerViewAdapter3 != null) {
            recyclerViewAdapter3.notifyDataSetChanged();
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cc0b1d", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public final void E0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcb8b86", new Object[]{this, new Integer(i)});
        } else if ((i & 4) != 0 && this.f != null) {
            List<IDMComponent> f2 = this.i.f();
            if (this.f.getChildCount() > 0) {
                this.f.removeAllViews();
            }
            if (!((ArrayList) this.o).isEmpty()) {
                ((ArrayList) this.o).clear();
            }
            if (!(f2 == null || f2.isEmpty())) {
                for (IDMComponent iDMComponent : f2) {
                    RecyclerViewHolder c2 = this.j.c(this.f, this.j.f(iDMComponent));
                    View view = c2.itemView;
                    if (vav.a(this.D, "enableFooterAppearEvent", false)) {
                        this.j.b(c2, iDMComponent);
                        if (view != null) {
                            this.f.addView(view);
                            ((ArrayList) this.o).add(c2);
                        }
                    } else {
                        if (view != null) {
                            this.f.addView(view);
                            ((ArrayList) this.o).add(c2);
                        }
                        this.j.b(c2, iDMComponent);
                    }
                    w(view, iDMComponent);
                    if (iDMComponent == null) {
                        this.y = c2;
                        f0(c2);
                    }
                }
            }
        }
    }

    public final UltronViewRebuildDelayTask F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronViewRebuildDelayTask) ipChange.ipc$dispatch("27cd4394", new Object[]{this});
        }
        UltronViewRebuildDelayTask ultronViewRebuildDelayTask = this.a0;
        if (ultronViewRebuildDelayTask != null) {
            return ultronViewRebuildDelayTask;
        }
        UltronViewRebuildDelayTask ultronViewRebuildDelayTask2 = new UltronViewRebuildDelayTask(I(), this.d);
        this.a0 = ultronViewRebuildDelayTask2;
        return ultronViewRebuildDelayTask2;
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc03545", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null && this.i != null) {
            viewGroup.removeAllViews();
            RecyclerViewHolder recyclerViewHolder = this.p;
            if (!(recyclerViewHolder == null || recyclerViewHolder.e0() == null)) {
                this.p.e0().f();
            }
            this.p = null;
            IDMComponent g = this.i.g();
            if (g != null) {
                RecyclerViewHolder c2 = this.j.c(this.h, this.j.f(g));
                View view = c2.itemView;
                if (view != null) {
                    this.h.addView(view);
                    this.p = c2;
                }
                this.j.b(c2, g);
            }
        }
    }

    public final kav G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kav) ipChange.ipc$dispatch("aa502fbc", new Object[]{this});
        }
        kav kavVar = this.e0;
        if (kavVar != null) {
            return kavVar;
        }
        kav kavVar2 = new kav(I());
        this.e0 = kavVar2;
        return kavVar2;
    }

    public RecyclerViewAdapter H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("7619919c", new Object[]{this});
        }
        return this.c;
    }

    public void H0(int i) {
        onq onqVar;
        onq onqVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i)});
            return;
        }
        if ((1 & i) != 0) {
            N0();
        }
        if ((i & 2) != 0) {
            J0();
        }
        if ((i & 4) != 0) {
            L0();
        }
        if ((i & 64) != 0) {
            M0();
        }
        if ((i & 32) != 0) {
            I0();
        }
        if (!((i & 8) == 0 || (onqVar2 = this.s) == null)) {
            onqVar2.c();
        }
        if ((i & 16) != 0 && (onqVar = this.t) != null) {
            onqVar.c();
        }
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.D;
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc95670", new Object[]{this});
            return;
        }
        IDMComponent b2 = this.i.b();
        RecyclerViewHolder recyclerViewHolder = this.q;
        if (b2 != null && recyclerViewHolder != null) {
            this.j.b(recyclerViewHolder, b2);
        }
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b611d64", new Object[]{this})).intValue();
        }
        return this.F;
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d00924", new Object[]{this});
        } else {
            this.c.notifyDataSetChanged();
        }
    }

    public Context K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f2315a;
    }

    public int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccd5bf43", new Object[]{this})).intValue();
        }
        return this.W;
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2334cddd", new Object[]{this});
            return;
        }
        List<IDMComponent> f2 = this.i.f();
        for (int i = 0; i < f2.size(); i++) {
            if (!sh4.a() || ((ArrayList) this.o).size() > i) {
                this.j.b((RecyclerViewHolder) ((ArrayList) this.o).get(i), f2.get(i));
            } else {
                return;
            }
        }
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d24f374", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4775805", new Object[]{this});
            return;
        }
        IDMComponent g = this.i.g();
        RecyclerViewHolder recyclerViewHolder = this.p;
        if (g != null && recyclerViewHolder != null) {
            this.j.b(recyclerViewHolder, g);
        }
    }

    public et6 N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("5bbeafb0", new Object[]{this});
        }
        return this.i;
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446731cf", new Object[]{this});
            return;
        }
        List<IDMComponent> h = this.i.h();
        for (int i = 0; i < h.size(); i++) {
            if (!sh4.a() || ((ArrayList) this.n).size() > i) {
                this.j.b((RecyclerViewHolder) ((ArrayList) this.n).get(i), h.get(i));
            } else {
                return;
            }
        }
    }

    public Map<String, Object> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c47d6922", new Object[]{this});
        }
        return this.A;
    }

    public void O0(mqk mqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cdca43", new Object[]{this, mqkVar});
        } else {
            T0(mqk.class, mqkVar);
        }
    }

    public z7v P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7v) ipChange.ipc$dispatch("225dc80d", new Object[]{this});
        }
        return this.b;
    }

    public void P0(String str, bsb bsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b221e1a", new Object[]{this, str, bsbVar});
        } else if (!TextUtils.isEmpty(str) && bsbVar != null) {
            this.K.put(str, bsbVar);
        }
    }

    public jo7 Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jo7) ipChange.ipc$dispatch("8922dc06", new Object[]{this});
        }
        return this.B;
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa93ac0", new Object[]{this});
            return;
        }
        P0("check_mutex", new rq3());
        P0("check_hidden", new lq3());
    }

    public final r8v R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8v) ipChange.ipc$dispatch("e27eb1a6", new Object[]{this});
        }
        if (this.b0 == null) {
            this.b0 = new r8v(I());
        }
        return this.b0;
    }

    public void R0(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722c4c73", new Object[]{this, str, z9eVar});
        } else {
            this.j.k(str, z9eVar);
        }
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4691074d", new Object[]{this})).intValue();
        }
        return this.R;
    }

    public void S0(epk epkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ed81a7", new Object[]{this, epkVar});
        }
    }

    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70fd2ea8", new Object[]{this});
        }
        return this.Q;
    }

    public <T> void T0(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else {
            this.m.put(cls, t);
        }
    }

    public int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af04c717", new Object[]{this})).intValue();
        }
        return this.E;
    }

    public void U0(rfw rfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9823e4a", new Object[]{this, rfwVar});
        } else {
            T0(rfw.class, rfwVar);
        }
    }

    public ppi V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppi) ipChange.ipc$dispatch("3aa53fac", new Object[]{this});
        }
        return this.J;
    }

    public void V0(String str, qbe qbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51286c1f", new Object[]{this, str, qbeVar});
            return;
        }
        if (this.C == null) {
            this.C = new HashMap();
        }
        this.C.put(str, qbeVar);
    }

    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.z;
    }

    public void W0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e650532", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            List<IDMComponent> c2 = this.i.c();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                int indexOf = c2.indexOf(list.get(i2));
                if (i == -1 || (indexOf < i && indexOf >= 0)) {
                    i = indexOf;
                }
            }
            if (i != -1) {
                int i3 = i + this.P;
                this.c.notifyItemRangeRemoved(i3, list.size());
                c2.removeAll(list);
                this.c.setData(c2);
                int size = (c2.size() - i3) + 1;
                if (size > 0) {
                    this.c.notifyItemRangeChanged(i3 - 1, size);
                }
            }
        }
    }

    public svk X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svk) ipChange.ipc$dispatch("4ea83ee", new Object[]{this});
        }
        return null;
    }

    public void X0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else {
            this.f2315a = context;
        }
    }

    public twl Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twl) ipChange.ipc$dispatch("97dd7de6", new Object[]{this});
        }
        return this.G;
    }

    public void Y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            this.d.getLayoutManager().scrollToPosition(i);
        }
    }

    public RecyclerView Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.d;
    }

    public void Z0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23fcf2dc", new Object[]{this, iDMComponent});
            return;
        }
        List<IDMComponent> c2 = this.i.c();
        if (iDMComponent != null && c2 != null && c2.contains(iDMComponent)) {
            Y0(c2.indexOf(iDMComponent));
        }
    }

    public <T> T a0(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{this, cls});
        }
        Object obj = ((HashMap) this.m).get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        return null;
    }

    public void a1(RecyclerViewAdapter recyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ec9b3a", new Object[]{this, recyclerViewAdapter});
        } else if (this.d != null) {
            rjc rjcVar = this.M;
            if (rjcVar == null || !rjcVar.b()) {
                this.c = recyclerViewAdapter;
            } else {
                this.c = this.M.a();
            }
            this.d.setAdapter(this.c);
        } else {
            throw new NullPointerException("The bindViewTree method must be called before setAdapter method.");
        }
    }

    public ujt b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ujt) ipChange.ipc$dispatch("c604d2f5", new Object[]{this});
        }
        return this.l;
    }

    public void b1(ucv ucvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8bc3e4", new Object[]{this, ucvVar});
        } else {
            this.d0 = ucvVar;
        }
    }

    public rew c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rew) ipChange.ipc$dispatch("181bd55e", new Object[]{this});
        }
        return this.j;
    }

    public void c1(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74f5fd2", new Object[]{this, viewGroup});
        } else {
            this.g = viewGroup;
        }
    }

    public qbe d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qbe) ipChange.ipc$dispatch("d293b0f2", new Object[]{this, str});
        }
        Map<String, qbe> map = this.C;
        if (map != null) {
            return (qbe) ((HashMap) map).get(str);
        }
        return null;
    }

    public void d1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        }
    }

    public final void e0(LinearLayoutManager linearLayoutManager, int i) {
        List<IDMComponent> c2;
        ArrayList<IDMComponent> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ab6582", new Object[]{this, linearLayoutManager, new Integer(i)});
        } else if (!f0 && (c2 = this.i.c()) != null) {
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i2 = this.H;
            ArrayList<IDMComponent> arrayList2 = null;
            if (i2 > findFirstVisibleItemPosition) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = findFirstVisibleItemPosition; i3 < this.H; i3++) {
                    if (i3 >= 0 && i3 < c2.size()) {
                        arrayList3.add(c2.get(i3));
                    }
                }
                arrayList2 = arrayList3;
                arrayList = null;
            } else if (i2 < findFirstVisibleItemPosition) {
                arrayList = new ArrayList();
                for (int i4 = this.H; i4 < findFirstVisibleItemPosition; i4++) {
                    if (i4 >= 0 && i4 < c2.size()) {
                        arrayList.add(c2.get(i4));
                    }
                }
            } else {
                arrayList = null;
            }
            int i5 = this.I;
            if (i5 < findLastVisibleItemPosition) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                for (int i6 = this.I; i6 < findLastVisibleItemPosition; i6++) {
                    if (i6 >= 0 && i6 < c2.size()) {
                        arrayList2.add(c2.get(i6));
                    }
                }
            } else if (i5 > findLastVisibleItemPosition) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i7 = findLastVisibleItemPosition; i7 < this.I; i7++) {
                    if (i7 >= 0 && i7 < c2.size()) {
                        arrayList.add(c2.get(i7));
                    }
                }
            }
            if (arrayList2 != null) {
                for (IDMComponent iDMComponent : arrayList2) {
                    s0(iDMComponent);
                }
            }
            if (arrayList != null) {
                for (IDMComponent iDMComponent2 : arrayList) {
                    r0(iDMComponent2);
                }
            }
            this.H = findFirstVisibleItemPosition;
            this.I = findLastVisibleItemPosition;
        }
    }

    public void e1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e476a23", new Object[]{this, new Integer(i)});
        } else {
            this.P = i;
        }
    }

    public final void f0(RecyclerViewHolder recyclerViewHolder) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833c527a", new Object[]{this, recyclerViewHolder});
        } else if (recyclerViewHolder != null && (view = recyclerViewHolder.itemView) != null) {
            view.setVisibility(8);
        }
    }

    public void f1(jc4 jc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b785387d", new Object[]{this, jc4Var});
        } else {
            this.j.m(jc4Var);
        }
    }

    public final void g0() {
        List<IDMComponent> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24dfb9c6", new Object[]{this});
        } else if (!f0 && (this.d.getLayoutManager() instanceof LinearLayoutManager) && (c2 = this.i.c()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.d.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int i = 0; i < c2.size(); i++) {
                if (i < findFirstVisibleItemPosition || i > findLastVisibleItemPosition) {
                    r0(c2.get(i));
                } else {
                    s0(c2.get(i));
                }
            }
        }
    }

    public void g1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df55027", new Object[]{this, new Integer(i)});
        } else {
            this.W = i;
        }
    }

    public final void h0() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ceaeeb", new Object[]{this});
            return;
        }
        if (sh4.b(this.f2315a)) {
            i = 2;
        }
        this.F = i;
    }

    public void h1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd1eae", new Object[]{this, new Integer(i)});
        } else {
            this.X = i;
        }
    }

    public void i0(List<IDMComponent> list, IDMComponent iDMComponent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05e390d", new Object[]{this, list, iDMComponent});
        } else if (list != null && list.size() != 0) {
            List<IDMComponent> c2 = this.i.c();
            if (iDMComponent != null) {
                i = this.P + c2.indexOf(iDMComponent) + 1;
            }
            this.c.notifyItemRangeInserted(i, list.size());
            c2.addAll(i, list);
            this.c.setData(c2);
            this.c.notifyItemRangeChanged(i, this.i.c().size() - 1);
        }
    }

    public void i1(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea82aa", new Object[]{this, et6Var});
            return;
        }
        this.i = et6Var;
        try {
            v1(et6Var.a());
        } catch (Throwable th) {
            UnifyLog.m(I(), "ViewEngine", CommandID.setDataSource, th.getMessage());
        }
    }

    public final boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("799ebd74", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView == null || recyclerView.getScrollState() == 0) {
            return false;
        }
        return true;
    }

    public void j1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532d8433", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d14258d", new Object[]{this})).booleanValue();
        }
        return this.Z;
    }

    public void k1(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b13275d", new Object[]{this, viewGroup});
        } else {
            this.h = viewGroup;
        }
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b57d734", new Object[]{this})).booleanValue();
        }
        return this.V;
    }

    public void l1(int i, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d227071e", new Object[]{this, new Integer(i), iDMComponent});
            return;
        }
        this.v = i;
        this.r = iDMComponent;
    }

    public boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public void m1(rjc rjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f85fdc5", new Object[]{this, rjcVar});
            return;
        }
        this.M = rjcVar;
        if (rjcVar != null) {
            rjcVar.c(this);
        }
    }

    public boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123d1ea7", new Object[]{this})).booleanValue();
        }
        return this.N;
    }

    public void n1(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785cfd12", new Object[]{this, new Integer(i), str});
            return;
        }
        this.R = i;
        this.Q = str;
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c43888", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public void o1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46af6d3", new Object[]{this, new Integer(i)});
        } else {
            this.E = i;
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f500e", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public void p1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1455dc9", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public final void q0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921109b8", new Object[]{this, iDMComponent});
            return;
        }
        iDMComponent.getData().put("status", "normal");
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        K0(arrayList);
    }

    public void q1(epk epkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ab44e", new Object[]{this, epkVar});
        }
    }

    public void r(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac0b3d8", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.A).put(str, obj);
        }
    }

    public final void r0(IDMComponent iDMComponent) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8997e1", new Object[]{this, iDMComponent});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("dismiss")) != null) {
            for (gsb gsbVar : list) {
                JSONObject fields = gsbVar.getFields();
                if (fields != null) {
                    this.J.a(fields.getString("target"), fields);
                }
            }
        }
    }

    public void r1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf91208", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public void s(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f640830d", new Object[]{this, onScrollListener});
            return;
        }
        if (this.L == null) {
            this.L = new HashSet();
        }
        this.L.add(onScrollListener);
    }

    public final void s0(IDMComponent iDMComponent) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbc00a9", new Object[]{this, iDMComponent});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("display")) != null) {
            for (gsb gsbVar : list) {
                JSONObject fields = gsbVar.getFields();
                if (fields != null) {
                    this.J.a(fields.getString("target"), fields);
                }
            }
        }
    }

    public void s1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cde7d2", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public void t(ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfac4f8b", new Object[]{this, viewGroup, viewGroup2});
        } else if (!f0) {
            this.s = new b(viewGroup, this.j);
            this.t = new c(viewGroup2, this.j);
        }
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        h3x h3xVar = this.k;
        if (h3xVar != null) {
            h3xVar.d();
        }
    }

    public void t1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2c3a3e", new Object[]{this, new Boolean(z)});
        }
    }

    public void u(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a51b650", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.e = linearLayout;
        this.d = recyclerView;
        rjc rjcVar = this.M;
        if (rjcVar != null && rjcVar.b()) {
            this.d.setLayoutManager(this.M.e(this.f2315a));
        }
        this.d.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.ultron.vfw.core.ViewEngine.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/vfw/core/ViewEngine$2");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (ViewEngine.b(ViewEngine.this) != null) {
                    for (RecyclerView.OnScrollListener onScrollListener : ViewEngine.b(ViewEngine.this)) {
                        onScrollListener.onScrollStateChanged(recyclerView2, i);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (ViewEngine.b(ViewEngine.this) != null) {
                    for (RecyclerView.OnScrollListener onScrollListener : ViewEngine.b(ViewEngine.this)) {
                        onScrollListener.onScrolled(recyclerView2, i, i2);
                    }
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    if (!ViewEngine.j(ViewEngine.this)) {
                        if (findFirstVisibleItemPosition > ViewEngine.k(ViewEngine.this)) {
                            ViewEngine viewEngine = ViewEngine.this;
                            ViewEngine.m(viewEngine, ViewEngine.l(viewEngine));
                        } else {
                            ViewEngine viewEngine2 = ViewEngine.this;
                            ViewEngine.n(viewEngine2, ViewEngine.l(viewEngine2));
                        }
                    }
                    if (findFirstVisibleItemPosition > ViewEngine.o(ViewEngine.this)) {
                        ViewEngine viewEngine3 = ViewEngine.this;
                        ViewEngine.m(viewEngine3, ViewEngine.p(viewEngine3));
                    } else {
                        ViewEngine viewEngine4 = ViewEngine.this;
                        ViewEngine.n(viewEngine4, ViewEngine.p(viewEngine4));
                    }
                    if (ViewEngine.q(ViewEngine.this)) {
                        try {
                            ViewEngine.c(ViewEngine.this, linearLayoutManager, i2);
                        } catch (Throwable th) {
                            UnifyLog.m(ViewEngine.this.I(), "ViewEngine", "组件隐藏展示通知", th.getMessage());
                        }
                    }
                }
            }
        });
        this.f = linearLayout2;
    }

    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        h3x h3xVar = this.k;
        if (h3xVar != null) {
            h3xVar.e();
        }
    }

    public void u1(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
        } else {
            this.j.n(fceVar);
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38c6add3", new Object[]{this})).booleanValue();
        }
        return vav.a(I(), "enableDiffRefreshRecyclerView", true);
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        h3x h3xVar = this.k;
        if (h3xVar != null) {
            h3xVar.f();
        }
    }

    public final void v1(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be2f3d1", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                String key = iDMComponent.getKey();
                if (!TextUtils.isEmpty(key)) {
                    p9v p9vVar = new p9v(key, this.J, I(), iDMComponent, this.K, this);
                    iDMComponent.setMessageChannel(p9vVar);
                    this.J.b(p9vVar);
                }
            }
        }
    }

    public final boolean w(View view, IDMComponent iDMComponent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65cd4f05", new Object[]{this, view, iDMComponent})).booleanValue();
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (!(iDMComponent == null || iDMComponent.getFields() == null || !iDMComponent.getFields().containsKey("dxStyleClipsToBounds"))) {
            z = iDMComponent.getFields().getBooleanValue("dxStyleClipsToBounds");
        }
        viewGroup.setClipChildren(z);
        viewGroup.setClipToPadding(z);
        return z;
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        h3x h3xVar = this.k;
        if (h3xVar != null) {
            h3xVar.g();
        }
    }

    public final void w1(RecyclerViewHolder recyclerViewHolder) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271c37b5", new Object[]{this, recyclerViewHolder});
        } else if (recyclerViewHolder != null && (view = recyclerViewHolder.itemView) != null) {
            view.setVisibility(0);
        }
    }

    public final void x(View view, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51327910", new Object[]{this, view, iDMComponent});
        } else if (!w(view, iDMComponent)) {
            view.getLayoutParams().height = -2;
        }
    }

    public final void x0(z7v z7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fef4dcf", new Object[]{this, z7vVar});
        } else if (z7vVar != null) {
            this.S = z7vVar.h();
            this.Q = z7vVar.f();
            this.R = z7vVar.e();
            this.V = z7vVar.g();
        }
    }

    public final boolean x1(vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d9b6127", new Object[]{this, vcvVar})).booleanValue();
        }
        if (vcvVar == null || !vcvVar.j()) {
            return false;
        }
        return true;
    }

    public void y() {
        jo7 jo7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        rew rewVar = this.j;
        if (rewVar != null) {
            rewVar.d();
        }
        Map<String, Object> map = this.A;
        if (map != null) {
            ((HashMap) map).clear();
        }
        twl twlVar = this.G;
        if (twlVar != null) {
            twlVar.f();
        }
        ujt ujtVar = this.l;
        if (ujtVar != null) {
            ujtVar.d();
        }
        if (sh4.j() && (jo7Var = this.B) != null) {
            jo7Var.e();
        }
        UltronViewRebuildDelayTask ultronViewRebuildDelayTask = this.a0;
        if (ultronViewRebuildDelayTask != null) {
            ultronViewRebuildDelayTask.p();
        }
        xur.a(this.D, this.f2315a);
    }

    public final void y0(List<IDMComponent> list, String str, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3e7f8", new Object[]{this, list, str, vcvVar});
        } else if (vav.a(this.D, "enableAsyncCalculateDiffOfRecyclerView", true)) {
            G().g(this.c, list, str, x1(vcvVar));
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cce550f", new Object[]{this});
            return;
        }
        h3x h3xVar = this.k;
        if (h3xVar != null) {
            h3xVar.destroy();
        }
    }

    public void z0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76b821", new Object[]{this, new Integer(i)});
        } else {
            A0(i, null);
        }
    }

    public ViewEngine(Context context, String str) {
        this(context, str, null);
    }

    public void A0(int i, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451f9570", new Object[]{this, new Integer(i), vcvVar});
        } else if (vcvVar == null || !vcvVar.d() || !j0()) {
            UltronViewRebuildDelayTask ultronViewRebuildDelayTask = this.a0;
            if (ultronViewRebuildDelayTask != null) {
                ultronViewRebuildDelayTask.b();
            }
            B(i, vcvVar);
        } else {
            hav.d("ViewEngine", "#延迟执行rebuild");
            z9v.u(K()).t(null, true, null);
            F().o(UltronViewRebuildDelayType.rebuildWhenIdleOrLastItemVisible, new d(i, vcvVar));
        }
    }

    public void D(vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af699ea7", new Object[]{this, vcvVar});
            return;
        }
        try {
            boolean a2 = vav.a(I(), "checkDXMemoCacheBeforeDownload", false);
            HashMap hashMap = new HashMap();
            for (o58 o58Var : this.i.e()) {
                if (o58Var != null && (!a2 || !this.l.c(o58Var.c, o58Var.e))) {
                    String str = o58Var.b;
                    if (!TextUtils.equals("native", str)) {
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            list.add(o58Var);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(o58Var);
                            hashMap.put(str, arrayList);
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                if (this.c0 == null) {
                    this.c0 = new i7v(I(), null);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.l.a((String) entry.getKey(), (List) entry.getValue(), this.c0, vcvVar);
                }
            }
        } catch (Throwable th) {
            hav.b("ViewEngine", "downloadTemplatesException", th.getMessage());
        }
    }

    public final void G0(int i, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d73be3", new Object[]{this, new Integer(i), vcvVar});
        } else if ((i & 1) != 0 && this.e != null) {
            List<IDMComponent> h = this.i.h();
            if (R().a(h, vcvVar)) {
                hav.d("ViewEngine", "数据未变更，不需要刷新头部");
                return;
            }
            if (this.e.getChildCount() > 0) {
                this.e.removeAllViews();
            }
            if (!((ArrayList) this.n).isEmpty()) {
                ((ArrayList) this.n).clear();
            }
            if (!(h == null || h.isEmpty())) {
                for (IDMComponent iDMComponent : h) {
                    RecyclerViewHolder c2 = this.j.c(this.e, this.j.f(iDMComponent));
                    View view = c2.itemView;
                    if (!sh4.d()) {
                        if (view != null) {
                            this.e.addView(view);
                            ((ArrayList) this.n).add(c2);
                        }
                        this.j.b(c2, iDMComponent);
                    } else if (view != null) {
                        ((ArrayList) this.n).add(c2);
                        this.j.b(c2, iDMComponent);
                        x(view, iDMComponent);
                        this.e.addView(view);
                    }
                    if (iDMComponent == this.r) {
                        this.x = c2;
                        if (iDMComponent.getStatus() == 0) {
                            q0(iDMComponent);
                            f0(c2);
                        } else {
                            this.u = true;
                        }
                    }
                }
            }
        }
    }

    public ViewEngine(Context context, String str, twl.b bVar) {
        this(context, str, bVar, false);
    }

    public ViewEngine(Context context, String str, twl.b bVar, boolean z) {
        this(context, str, bVar, z, null);
    }

    public ViewEngine(Context context, String str, twl.b bVar, z7v z7vVar) {
        this(context, str, bVar, false, z7vVar);
    }

    public void K0(List<IDMComponent> list) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1f2d49", new Object[]{this, list});
        } else if (list != null && (this.d.getLayoutManager() instanceof LinearLayoutManager)) {
            List<IDMComponent> c2 = this.i.c();
            if (this.c.getData().size() != c2.size()) {
                UnifyLog.m(I(), "ViewEngine", "refreshComponents，差量刷新容器数据与最新数据源数据不匹配！", new String[0]);
                z0(127);
                return;
            }
            this.c.setData(c2);
            List<IDMComponent> h = this.i.h();
            List<IDMComponent> f2 = this.i.f();
            List<IDMComponent> j = this.i.j();
            List<IDMComponent> i2 = this.i.i();
            IDMComponent b2 = this.i.b();
            IDMComponent g = this.i.g();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (IDMComponent iDMComponent : list) {
                if (c2.contains(iDMComponent)) {
                    arrayList.add(Integer.valueOf(c2.indexOf(iDMComponent)));
                }
                if (h.contains(iDMComponent)) {
                    i3 = 1;
                }
                if (f2.contains(iDMComponent)) {
                    z = true;
                }
                if (b2 != null && iDMComponent == b2) {
                    z4 = true;
                }
                if (g != null && iDMComponent == g) {
                    z5 = true;
                }
                if (j != null && j.contains(iDMComponent)) {
                    z2 = true;
                }
                if (i2 != null && i2.contains(iDMComponent)) {
                    z3 = true;
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                i = 0;
                int intValue = ((Integer) arrayList.get(0)).intValue();
                int intValue2 = (((Integer) arrayList.get(arrayList.size() - 1)).intValue() - intValue) + 1;
                if (this.P > 0) {
                    int i4 = intValue + intValue2;
                    int size = c2.size();
                    int i5 = this.P;
                    if (i4 < size + i5) {
                        this.c.notifyItemRangeChanged(intValue, intValue2 + i5);
                    }
                }
                this.c.notifyItemRangeChanged(intValue, intValue2);
            } else {
                i = 0;
            }
            int i6 = (z ? 4 : 0) | i3 | (z2 ? 8 : 0) | (z3 ? 16 : 0) | (z4 ? 32 : 0);
            if (z5) {
                i = 64;
            }
            H0(i | i6);
            lbv.p(this.D);
        }
    }

    public ViewEngine(Context context, String str, twl.b bVar, boolean z, z7v z7vVar) {
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = null;
        this.q = null;
        this.u = false;
        this.v = -1;
        this.w = -1;
        this.z = "ultron";
        this.D = "default";
        this.F = 1;
        this.J = new ppi();
        this.K = new HashMap();
        this.L = null;
        this.N = false;
        this.P = 0;
        this.W = -1;
        this.X = -1;
        this.Y = true;
        this.Z = true;
        this.a0 = null;
        this.c0 = null;
        this.e0 = null;
        f0 = vav.a(str, sh4.KEY_SCROLL_VISIBILITY_CHECK, false);
        this.f2315a = context;
        this.b = z7vVar;
        this.U = z;
        if (bVar != null) {
            this.G = new twl(this, bVar);
        }
        if (!TextUtils.isEmpty(str)) {
            this.z = str;
            this.D = str;
        }
        x0(z7vVar);
        this.B = jo7.a(this);
        rew rewVar = new rew(this);
        this.j = rewVar;
        aae g = rewVar.g("weex2");
        if (g instanceof h3x) {
            this.k = (h3x) g;
        }
        T0(rew.class, rewVar);
        ujt ujtVar = new ujt(this);
        this.l = ujtVar;
        T0(ujt.class, ujtVar);
        HashMap hashMap = new HashMap();
        this.A = hashMap;
        hashMap.put("ViewEngine", this);
        this.i = new et6();
        h0();
        try {
            Q0();
        } catch (Throwable th) {
            UnifyLog.m(I(), "ViewEngine", "registerIDMComponentChangedListeners", th.getMessage());
        }
        this.M = new x17();
        pav.g(new a());
    }

    public final void B(int i, vcv vcvVar) {
        onq onqVar;
        onq onqVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3092b45b", new Object[]{this, new Integer(i), vcvVar});
            return;
        }
        hav.d("ViewEngine", "#rebuild start");
        et6 et6Var = this.i;
        if (et6Var != null) {
            ucv ucvVar = this.d0;
            if (ucvVar != null) {
                ucvVar.a(et6Var);
            }
            List<IDMComponent> c2 = et6Var.c();
            String valueOf = String.valueOf(System.currentTimeMillis());
            boolean z = vcvVar != null && vcvVar.b() && v();
            if (z) {
                y0(c2, valueOf, vcvVar);
            }
            z9v u = z9v.u(this.f2315a);
            u.m("downloadTemplates", System.currentTimeMillis(), "apmClientAfterNetworkLogicProcess", true);
            D(vcvVar);
            u.B("downloadTemplates", false, null);
            u.B("apmClientAfterNetworkLogicProcess", false, null);
            u.D("apmClientContainerRender", null);
            if (!vav.a(I(), "enableDelayRenderHeaderAndFooterWhenIdle", false) || !j0()) {
                u.m("rebuildHeader", System.currentTimeMillis(), "apmClientContainerRender", true);
                G0(i, vcvVar);
                u.B("rebuildHeader", false, null);
                C0(i, c2, z, valueOf, vcvVar);
                u.m("rebuildFooter", System.currentTimeMillis(), "apmClientContainerRender", true);
                E0(i);
                u.B("rebuildFooter", false, null);
            } else {
                hav.d("ViewEngine", "#正在滚动，延迟更新Header和Footer");
                u.t(null, true, null);
                F().o(UltronViewRebuildDelayType.rebuildWhenIdle, new e(i, vcvVar));
                C0(i, c2, z, valueOf, vcvVar);
            }
            if ((i & 64) != 0) {
                F0();
            }
            if ((i & 32) != 0) {
                B0();
            }
            if (!((i & 8) == 0 || (onqVar2 = this.s) == null)) {
                onqVar2.b();
            }
            if (!((i & 16) == 0 || (onqVar = this.t) == null)) {
                onqVar.b();
            }
            RecyclerView recyclerView = this.d;
            if (recyclerView != null && recyclerView.getViewTreeObserver() != null) {
                this.d.getViewTreeObserver().addOnGlobalLayoutListener(new f());
            }
        }
    }
}
