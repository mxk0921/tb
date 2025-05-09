package com.taobao.android.icart.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.CartSkeletonImageView;
import com.taobao.android.icart.widget.ScrollInstanceLinearLayoutManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c9x;
import tb.cb4;
import tb.cfx;
import tb.ct1;
import tb.ed3;
import tb.et6;
import tb.fsb;
import tb.fxo;
import tb.g1a;
import tb.hav;
import tb.imb;
import tb.ir6;
import tb.jg2;
import tb.juv;
import tb.kmb;
import tb.lof;
import tb.lu;
import tb.ly;
import tb.mc3;
import tb.mgw;
import tb.na3;
import tb.nc3;
import tb.neb;
import tb.oc3;
import tb.rew;
import tb.sca;
import tb.t2o;
import tb.u55;
import tb.ub3;
import tb.ux;
import tb.vav;
import tb.xhv;
import tb.ykl;
import tb.yua;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartPopupWindowManager implements imb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String P = Localization.q(R.string.app_load_completed);
    public List<imb.b> A;
    public List<IDMComponent> B;
    public boolean C;
    public Handler D;
    public View F;
    public PopupThemeManager G;
    public List<neb> H;
    public jg2 I;
    public View.OnLayoutChangeListener K;
    public int L;
    public ViewTreeObserver.OnGlobalLayoutListener M;

    /* renamed from: a  reason: collision with root package name */
    public et6 f7987a;
    public ViewEngine b;
    public FrameLayout c;
    public LinearLayout d;
    public CartRecyclerView e;
    public LinearLayout f;
    public ImageView g;
    public RecyclerViewAdapter h;
    public View i;
    public AlphaAnimation j;
    public AlphaAnimation k;
    public TranslateAnimation l;
    public TranslateAnimation m;
    public RelativeLayout n;
    public CartSkeletonImageView o;
    public imb.a p;
    public final ViewGroup q;
    public ViewGroup r;
    public Activity s;
    public lu t;
    public final kmb u;
    public RecyclerView v;
    public PtrBase w;
    public cfx x;
    public ScrollInstanceLinearLayoutManager y;
    public zxb z;
    public boolean E = true;
    public boolean J = false;
    public final ct1.b N = new c();
    public final ct1.a O = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class CartPopRecyclerView extends CartRecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<CartPopupWindowManager> mManagerWeakReference;

        static {
            t2o.a(478150815);
        }

        public CartPopRecyclerView(Context context, CartPopupWindowManager cartPopupWindowManager) {
            super(context);
            this.mManagerWeakReference = new WeakReference<>(cartPopupWindowManager);
        }

        public static /* synthetic */ Object ipc$super(CartPopRecyclerView cartPopRecyclerView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$CartPopRecyclerView");
        }

        @Override // com.taobao.android.icart.widget.CartRecyclerView
        public int getRecyclerViewPaddingBottom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d1f513c", new Object[]{this})).intValue();
            }
            if (DataBizContext.ShareContext.needShowCushionView()) {
                return 0;
            }
            CartPopupWindowManager cartPopupWindowManager = this.mManagerWeakReference.get();
            if (this.mFooterView == null || cartPopupWindowManager == null || cartPopupWindowManager.isFullScreen()) {
                return 0;
            }
            if (CartPopupWindowManager.y(cartPopupWindowManager) == null || !CartPopupWindowManager.y(cartPopupWindowManager).i) {
                return Math.max(cb4.G(CartPopupWindowManager.G(cartPopupWindowManager)), 0);
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements PtrBase.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.icart.manager.CartPopupWindowManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0426a extends ux {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0426a() {
            }

            public static /* synthetic */ Object ipc$super(C0426a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$10$1");
            }

            @Override // tb.ojd
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.ojd
            public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                }
            }

            @Override // tb.ux
            public boolean e(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
                }
                return !CartPopupWindowManager.this.isShowing();
            }
        }

        public a() {
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void a(PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
            } else {
                CartPopupWindowManager.G(CartPopupWindowManager.this).f0(true, null, new C0426a());
            }
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void b(PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements CartRecyclerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements CartRecyclerView.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.android.icart.widget.CartRecyclerView.c
            public void a() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("aaaaf3ef", new Object[]{this});
                    return;
                }
                kmb G = CartPopupWindowManager.G(CartPopupWindowManager.this);
                StringBuilder sb = new StringBuilder("isMain=");
                if (TBMainHost.b().getContext() == CartPopupWindowManager.n(CartPopupWindowManager.this)) {
                    z = true;
                }
                sb.append(z);
                juv.d(G, "Page_ShoppingCart_PopLayer_LoadMore", sb.toString());
            }
        }

        public b() {
        }

        @Override // com.taobao.android.icart.widget.CartRecyclerView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaaaf3ef", new Object[]{this});
            } else {
                CartPopupWindowManager.r(CartPopupWindowManager.this).setOnEndViewExposure(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ct1.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends ly<RecyclerView> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$12$1");
            }

            /* renamed from: b */
            public void a(RecyclerView recyclerView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2de3ba5", new Object[]{this, recyclerView});
                } else {
                    CartPopupWindowManager.q(CartPopupWindowManager.this, recyclerView);
                }
            }
        }

        public c() {
        }

        @Override // tb.ct1.b
        public void a(PageInfo pageInfo, DataInfo dataInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cbf0fa3", new Object[]{this, pageInfo, dataInfo});
                return;
            }
            CartRecyclerView r = CartPopupWindowManager.r(CartPopupWindowManager.this);
            if (r != null) {
                r.resetScroll();
                if (pageInfo == PageInfo.FIRST_PAGE) {
                    r.scrollToPosition(0);
                }
            }
            if (CartPopupWindowManager.s(CartPopupWindowManager.this)) {
                if (CartPopupWindowManager.t(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.t(CartPopupWindowManager.this).refreshComplete(CartPopupWindowManager.u());
                    if (dataInfo == DataInfo.NORMAL_DATA) {
                        CartPopupWindowManager.t(CartPopupWindowManager.this).setMode(PullBase.Mode.PULL_FROM_END);
                    }
                }
                if (r != null) {
                    r.removeEndView(CartPopupWindowManager.p(CartPopupWindowManager.this));
                }
            } else {
                if (CartPopupWindowManager.v(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.v(CartPopupWindowManager.this).d();
                    CartPopupWindowManager.v(CartPopupWindowManager.this).c(new a());
                    CartPopupWindowManager.r(CartPopupWindowManager.this).setCartRecommend(CartPopupWindowManager.v(CartPopupWindowManager.this));
                }
                if (CartPopupWindowManager.t(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.t(CartPopupWindowManager.this).refreshComplete(CartPopupWindowManager.u());
                    CartPopupWindowManager.t(CartPopupWindowManager.this).setMode(PullBase.Mode.DISABLED);
                }
                boolean o = ed3.o(CartPopupWindowManager.G(CartPopupWindowManager.this));
                CartPopupWindowManager.w(CartPopupWindowManager.this, o, CartRecommendRefreshScene.build);
                if (o) {
                    CartPopupWindowManager.r(CartPopupWindowManager.this).hideCushionView();
                } else {
                    CartPopupWindowManager.r(CartPopupWindowManager.this).showCushionView(true);
                }
                UnifyLog.e("CartPopupWindowManager", "isNeedLoadRecommend=" + o);
                UnifyLog.e("CartPopupWindowManager", "filterItem=" + CartPopupWindowManager.x(CartPopupWindowManager.this).y() + ",feedFlowConfig=" + sca.f(CartPopupWindowManager.x(CartPopupWindowManager.this)));
            }
            if (pageInfo == PageInfo.FIRST_PAGE) {
                CartPopupWindowManager.z(CartPopupWindowManager.this).f(CartPopupWindowManager.y(CartPopupWindowManager.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ct1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends ly<RecyclerView> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$13$1");
            }

            /* renamed from: b */
            public void a(RecyclerView recyclerView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2de3ba5", new Object[]{this, recyclerView});
                } else {
                    CartPopupWindowManager.q(CartPopupWindowManager.this, recyclerView);
                }
            }
        }

        public d() {
        }

        @Override // tb.ct1.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1118edb", new Object[]{this});
                return;
            }
            CartPopupWindowManager.r(CartPopupWindowManager.this).resetScroll();
            lu v = CartPopupWindowManager.v(CartPopupWindowManager.this);
            if (v != null && !CartPopupWindowManager.s(CartPopupWindowManager.this)) {
                if (v.e()) {
                    v.a();
                    if (v.g()) {
                        CartPopupWindowManager.v(CartPopupWindowManager.this).d();
                        CartPopupWindowManager.v(CartPopupWindowManager.this).c(new a());
                        CartPopupWindowManager.v(CartPopupWindowManager.this).k();
                        CartPopupWindowManager.v(CartPopupWindowManager.this).j("adjust");
                    }
                    CartPopupWindowManager.r(CartPopupWindowManager.this).hideCushionView();
                } else if (v.a()) {
                    CartPopupWindowManager.w(CartPopupWindowManager.this, false, "adjust");
                    CartPopupWindowManager.r(CartPopupWindowManager.this).showCushionView(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            View childAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else if (CartPopupWindowManager.B(CartPopupWindowManager.this) != null && (CartPopupWindowManager.B(CartPopupWindowManager.this).getChildAt(0) instanceof DXRootView) && (childAt = ((DXRootView) CartPopupWindowManager.B(CartPopupWindowManager.this).getChildAt(0)).getChildAt(0)) != null) {
                childAt.sendAccessibilityEvent(8);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CartPopupWindowManager.C(CartPopupWindowManager.this).setEnabled(false);
            CartPopupWindowManager.this.f(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements View.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && CartPopupWindowManager.this.isShowing() && !CartPopupWindowManager.D(CartPopupWindowManager.this).hasStarted()) {
                CartPopupWindowManager.this.f(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CartPopupWindowManager.this.f(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                    CartPopupWindowManager.o(CartPopupWindowManager.this);
                }
            }
        }

        public i() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (CartPopupWindowManager.this.isShowing()) {
                View decorView = CartPopupWindowManager.n(CartPopupWindowManager.this).getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int height = rect.height();
                if (height != CartPopupWindowManager.this.L) {
                    if (ykl.a()) {
                        CartPopupWindowManager.A(CartPopupWindowManager.this).post(new a());
                    } else {
                        CartPopupWindowManager.o(CartPopupWindowManager.this);
                    }
                    CartPopupWindowManager.E(CartPopupWindowManager.this, height);
                }
                CartPopupWindowManager.this.L = height;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nc3 f8003a;
        public final /* synthetic */ cfx c;

        public j(nc3 nc3Var, cfx cfxVar) {
            this.f8003a = nc3Var;
            this.c = cfxVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartPopupWindowManager.F(CartPopupWindowManager.this, this.f8003a, this.c.u());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements g1a<oc3, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nc3 f8004a;
        public final /* synthetic */ g1a c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements View.OnLayoutChangeListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else {
                    mc3.v(CartPopupWindowManager.G(CartPopupWindowManager.this), k.this.f8004a);
                }
            }
        }

        public k(nc3 nc3Var, g1a g1aVar) {
            this.f8004a = nc3Var;
            this.c = g1aVar;
        }

        /* renamed from: a */
        public xhv invoke(oc3 oc3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("d420f3af", new Object[]{this, oc3Var});
            }
            if (this.f8004a.e() != null) {
                try {
                    ViewGroup p = CartPopupWindowManager.G(CartPopupWindowManager.this).e().p();
                    if (CartPopupWindowManager.H(CartPopupWindowManager.this) != null) {
                        p.removeOnLayoutChangeListener(CartPopupWindowManager.H(CartPopupWindowManager.this));
                    }
                    CartPopupWindowManager.I(CartPopupWindowManager.this, new a());
                    p.addOnLayoutChangeListener(CartPopupWindowManager.H(CartPopupWindowManager.this));
                } catch (Throwable th) {
                    ub3.g("CartPopupWindowManager#onShow", th.getMessage());
                }
            }
            g1a g1aVar = this.c;
            if (g1aVar == null) {
                return null;
            }
            g1aVar.invoke(oc3Var);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements g1a<Map<String, ?>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        /* renamed from: a */
        public xhv invoke(Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("46f94725", new Object[]{this, map});
            }
            try {
                ViewGroup p = CartPopupWindowManager.G(CartPopupWindowManager.this).e().p();
                if (CartPopupWindowManager.H(CartPopupWindowManager.this) != null) {
                    p.removeOnLayoutChangeListener(CartPopupWindowManager.H(CartPopupWindowManager.this));
                }
                if (CartPopupWindowManager.A(CartPopupWindowManager.this) != null && (CartPopupWindowManager.A(CartPopupWindowManager.this).getParent() instanceof ViewGroup)) {
                    ((ViewGroup) CartPopupWindowManager.A(CartPopupWindowManager.this).getParent()).removeView(CartPopupWindowManager.A(CartPopupWindowManager.this));
                }
                CartPopupWindowManager.J(CartPopupWindowManager.this, true);
                return null;
            } catch (Throwable th) {
                ub3.g("CartPopupWindowManager#onDismiss", th.getMessage());
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartPopupWindowManager.J(CartPopupWindowManager.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartPopupWindowManager.A(CartPopupWindowManager.this).removeView(CartPopupWindowManager.K(CartPopupWindowManager.this));
            }
        }
    }

    static {
        t2o.a(478150792);
        t2o.a(479199240);
    }

    public CartPopupWindowManager(kmb kmbVar, ViewGroup viewGroup) {
        this.u = kmbVar;
        this.q = viewGroup;
    }

    public static /* synthetic */ FrameLayout A(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9c9ce35d", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.c;
    }

    public static /* synthetic */ LinearLayout B(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("17451347", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.d;
    }

    public static /* synthetic */ View C(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9f6dd051", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.i;
    }

    public static /* synthetic */ AlphaAnimation D(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("39baabe4", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.k;
    }

    public static /* synthetic */ void E(CartPopupWindowManager cartPopupWindowManager, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76ee288", new Object[]{cartPopupWindowManager, new Integer(i2)});
        } else {
            cartPopupWindowManager.P(i2);
        }
    }

    public static /* synthetic */ void F(CartPopupWindowManager cartPopupWindowManager, nc3 nc3Var, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600b335a", new Object[]{cartPopupWindowManager, nc3Var, g1aVar});
        } else {
            cartPopupWindowManager.N(nc3Var, g1aVar);
        }
    }

    public static /* synthetic */ kmb G(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("319db122", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.u;
    }

    public static /* synthetic */ View.OnLayoutChangeListener H(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLayoutChangeListener) ipChange.ipc$dispatch("ce0aa9eb", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.K;
    }

    public static /* synthetic */ View.OnLayoutChangeListener I(CartPopupWindowManager cartPopupWindowManager, View.OnLayoutChangeListener onLayoutChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLayoutChangeListener) ipChange.ipc$dispatch("d55f02c0", new Object[]{cartPopupWindowManager, onLayoutChangeListener});
        }
        cartPopupWindowManager.K = onLayoutChangeListener;
        return onLayoutChangeListener;
    }

    public static /* synthetic */ void J(CartPopupWindowManager cartPopupWindowManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6d025d", new Object[]{cartPopupWindowManager, new Boolean(z)});
        } else {
            cartPopupWindowManager.V(z);
        }
    }

    public static /* synthetic */ View K(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("451d95f8", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.F;
    }

    public static /* synthetic */ List L(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5c798292", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.H;
    }

    public static /* synthetic */ Activity n(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a4d30d2a", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.s;
    }

    public static /* synthetic */ void o(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a31041d", new Object[]{cartPopupWindowManager});
        } else {
            cartPopupWindowManager.c0();
        }
    }

    public static /* synthetic */ RecyclerView p(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("b8eef956", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.v;
    }

    public static /* synthetic */ RecyclerView q(CartPopupWindowManager cartPopupWindowManager, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("25e7a6d1", new Object[]{cartPopupWindowManager, recyclerView});
        }
        cartPopupWindowManager.v = recyclerView;
        return recyclerView;
    }

    public static /* synthetic */ CartRecyclerView r(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartRecyclerView) ipChange.ipc$dispatch("4089b561", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.e;
    }

    public static /* synthetic */ boolean s(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6becf9b1", new Object[]{cartPopupWindowManager})).booleanValue();
        }
        return cartPopupWindowManager.Q();
    }

    public static /* synthetic */ PtrBase t(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("c0d614e", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.w;
    }

    public static /* synthetic */ String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6b45c36", new Object[0]);
        }
        return P;
    }

    public static /* synthetic */ lu v(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lu) ipChange.ipc$dispatch("ee95ef65", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.t;
    }

    public static /* synthetic */ void w(CartPopupWindowManager cartPopupWindowManager, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3039fbd5", new Object[]{cartPopupWindowManager, new Boolean(z), str});
        } else {
            cartPopupWindowManager.e0(z, str);
        }
    }

    public static /* synthetic */ zxb x(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("d84ef5f6", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.z;
    }

    public static /* synthetic */ cfx y(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfx) ipChange.ipc$dispatch("6b132570", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.x;
    }

    public static /* synthetic */ PopupThemeManager z(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupThemeManager) ipChange.ipc$dispatch("39ab56ea", new Object[]{cartPopupWindowManager});
        }
        return cartPopupWindowManager.G;
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f509184", new Object[]{this});
            return;
        }
        View view = this.i;
        if (view != null) {
            ViewProxy.setOnClickListener(view, new f());
        }
        this.c.setOnKeyListener(new g());
    }

    public final void N(nc3 nc3Var, g1a<oc3, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a133b6d1", new Object[]{this, nc3Var, g1aVar});
        } else {
            mc3.q(this.u, nc3Var, new k(nc3Var, g1aVar), new l());
        }
    }

    public final void P(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6eb42a", new Object[]{this, new Integer(i2)});
        } else if (vav.a(c9x.CART_BIZ_NAME, "enablePopPaddingView", true)) {
            if (i2 - this.L < 0) {
                if (this.F.getParent() == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                    int a2 = fxo.a(this.s);
                    layoutParams.height = a2;
                    layoutParams.topMargin = fxo.b(this.s) - a2;
                    this.c.addView(this.F);
                }
            } else if (this.F.getParent() != null) {
                this.F.post(new n());
            }
        }
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c456e7c2", new Object[]{this})).booleanValue();
        }
        return this.u.d().C(this.u.d().z());
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.j = alphaAnimation;
        alphaAnimation.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.k = alphaAnimation2;
        alphaAnimation2.setDuration(200L);
        d0();
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21535c13", new Object[]{this});
        } else {
            this.t = new ed3(this.e, this.u, "main");
        }
    }

    public final void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3526af", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            View view = new View(this.s);
            this.i = view;
            view.setBackgroundColor(Color.parseColor("#7F000000"));
            this.c.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.s).inflate(R.layout.icart_cart_float, (ViewGroup) this.c, false);
        this.n = relativeLayout;
        relativeLayout.setClickable(true);
        this.d = (LinearLayout) this.n.findViewById(R.id.float_header);
        this.f = (LinearLayout) this.n.findViewById(R.id.float_bottom);
        ImageView imageView = (ImageView) this.n.findViewById(R.id.float_popup_close_button);
        this.g = imageView;
        if (z) {
            imageView.setVisibility(8);
        }
        this.w = (PtrBase) this.n.findViewById(R.id.float_ptr);
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        } else if (this.w.indexOfChild(this.e) == -1) {
            this.w.addView(this.e, new ViewGroup.LayoutParams(-1, -1));
        }
        this.e.setFooterView(this.u.e().q());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        if (ykl.a() && !this.E) {
            layoutParams.gravity = GravityCompat.END;
        }
        this.c.addView(this.n, layoutParams);
        this.h = new RecyclerViewAdapter(this.b) { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                if (str.hashCode() == -351831764) {
                    super.onBindViewHolder((RecyclerViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$8");
            }

            @Override // com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter
            /* renamed from: N */
            public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb07792c", new Object[]{this, recyclerViewHolder, new Integer(i2)});
                    return;
                }
                super.onBindViewHolder(recyclerViewHolder, i2);
                lof.a(CartPopupWindowManager.G(CartPopupWindowManager.this), this.b, recyclerViewHolder, i2);
                for (neb nebVar : CartPopupWindowManager.L(CartPopupWindowManager.this)) {
                    nebVar.a(this.b, recyclerViewHolder, i2);
                }
            }
        };
        ScrollInstanceLinearLayoutManager scrollInstanceLinearLayoutManager = new ScrollInstanceLinearLayoutManager(this.b.K());
        this.y = scrollInstanceLinearLayoutManager;
        scrollInstanceLinearLayoutManager.y(this.e);
        this.y.setOrientation(1);
        this.y.A(false);
        this.e.setLayoutManager(this.y);
        this.e.setAdapter(this.h);
        this.e.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                if (str.hashCode() == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/CartPopupWindowManager$9");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() == 0 && CartPopupWindowManager.p(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.p(CartPopupWindowManager.this).scrollToPosition(0);
                }
            }
        });
        this.w.setMode(PullBase.Mode.DISABLED);
        this.w.getStartLayout().setLoadingDelegate(new yua(this.b.K(), this.u));
        this.w.setOnRefreshListener(new a());
        S();
        this.e.setOnEndViewExposure(new b());
        this.G = new PopupThemeManager(this.u, this.I, this.n, this.e);
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63ddfe", new Object[]{this});
            return;
        }
        imb.a aVar = this.p;
        if (aVar != null) {
            aVar.a(this.x);
        }
        Iterator it = ((CopyOnWriteArrayList) this.A).iterator();
        while (it.hasNext()) {
            ((imb.b) it.next()).onCancel();
        }
    }

    public final void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0c1594", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.c.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        this.u.d().P(this.N);
        this.u.d().O(this.O);
        if (z) {
            O();
            U();
        }
        if (this.v != null) {
            this.t.h();
        }
        ((ArrayList) this.B).clear();
        this.f7987a = null;
        this.e.removeAllViews();
    }

    public final void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a50509", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.C) {
            T(z);
            M();
            R();
            this.C = true;
        }
        Iterator it = ((CopyOnWriteArrayList) this.A).iterator();
        while (it.hasNext()) {
            ((imb.b) it.next()).onShow();
        }
        this.e.removeAllViews();
        this.e.setPadding(0, 0, 0, 0);
        if (this.t != null) {
            e0(false, CartRecommendRefreshScene.build);
        }
        this.u.d().P(this.N);
        this.u.d().O(this.O);
        this.w.setMode(PullBase.Mode.DISABLED);
        this.D.removeCallbacksAndMessages(null);
    }

    public final void X() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6757d664", new Object[]{this});
            return;
        }
        List<IDMComponent> c2 = this.f7987a.c();
        if (c2 == null || c2.size() != 1) {
            this.y.A(true);
        } else {
            IDMComponent iDMComponent = c2.get(0);
            if (iDMComponent != null && "dinamicx".equals(iDMComponent.getContainerType())) {
                z = true;
            }
            this.y.A(z);
        }
        this.h.setData(c2);
        this.h.notifyDataSetChanged();
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe4b1d", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.f.removeAllViews();
            }
            List<IDMComponent> f2 = this.f7987a.f();
            rew rewVar = (rew) this.b.a0(rew.class);
            if (f2 != null && f2.size() > 0) {
                for (IDMComponent iDMComponent : f2) {
                    RecyclerViewHolder c2 = rewVar.c(this.u.e().p(), rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.f.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b330af0f", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                this.d.removeAllViews();
            }
            rew rewVar = (rew) this.b.a0(rew.class);
            List<IDMComponent> h2 = this.f7987a.h();
            if (h2 != null && h2.size() > 0) {
                for (IDMComponent iDMComponent : h2) {
                    RecyclerViewHolder c2 = rewVar.c(this.u.e().r(), rewVar.f(iDMComponent));
                    View view = c2.itemView;
                    if (view != null) {
                        this.d.addView(view);
                    }
                    rewVar.b(c2, iDMComponent);
                }
            }
        }
    }

    @Override // tb.imb
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d416b5e6", new Object[]{this});
        }
        return this.d;
    }

    public void a0(int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e1670b", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 == 2) {
            z = false;
        }
        this.E = z;
    }

    @Override // tb.imb
    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6023090", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.B).clear();
        ((ArrayList) this.B).addAll(list);
    }

    public final void b0() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cd26c8", new Object[]{this});
        } else if (this.e != null && ykl.a()) {
            int H = TBAutoSizeConfig.x().H(this.s);
            if (this.E) {
                i2 = DXWidgetNode.DXMeasureSpec.c(H, 1073741824);
            } else {
                i2 = DXWidgetNode.DXMeasureSpec.c(H / 2, 1073741824);
            }
            this.b.h1(i2);
            this.e.setTag(new Pair("PopWidthSpec", Integer.valueOf(i2)));
        }
    }

    @Override // tb.imb
    public void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76b821", new Object[]{this, new Integer(i2)});
        } else if (this.f7987a != null && this.C) {
            if (vav.a(c9x.CART_BIZ_NAME, "downloadTemplatesAtPopup", true)) {
                this.b.C();
            }
            b0();
            if ((1 & i2) != 0) {
                Z();
            }
            if ((2 & i2) != 0) {
                X();
            }
            if ((i2 & 4) != 0) {
                Y();
            }
            if (ykl.a()) {
                this.b.h1(DXWidgetNode.DXMeasureSpec.c(TBAutoSizeConfig.x().H(this.b.K()), 1073741824));
            }
        }
    }

    public final void c0() {
        int i2;
        ViewGroup viewGroup;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94566bb7", new Object[]{this});
        } else if (this.x != null) {
            this.E = TBAutoSizeConfig.x().T(this.b.K());
            View d2 = this.x.d();
            if (d2 != null) {
                d2.getLocationOnScreen(new int[2]);
                i2 = d2.getHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
                marginLayoutParams.bottomMargin = i2;
                this.q.setLayoutParams(marginLayoutParams);
            } else {
                i2 = fxo.a(this.s);
            }
            if (this.x.h() > 0.0f) {
                if (d2 != null) {
                    viewGroup = this.u.e().o0();
                } else {
                    viewGroup = this.r;
                }
                int height = viewGroup.getHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
                int i4 = height - i2;
                if (!ykl.a()) {
                    layoutParams.height = (int) (i4 * this.x.h());
                } else if (this.E) {
                    layoutParams.height = (int) (i4 * this.x.h());
                    layoutParams.width = m();
                    layoutParams.gravity = 80;
                } else {
                    layoutParams.height = i4;
                    layoutParams.width = m();
                    layoutParams.gravity = 85;
                }
                if (d2 != null) {
                    i3 = 0;
                } else {
                    i3 = i2;
                }
                layoutParams.bottomMargin = i3;
                this.n.setLayoutParams(layoutParams);
            }
            View view = this.i;
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (i2 <= 0) {
                    marginLayoutParams2.bottomMargin = 0;
                } else if (!ykl.a()) {
                    marginLayoutParams2.bottomMargin = i2;
                } else if (this.E || d2 == null) {
                    marginLayoutParams2.bottomMargin = i2;
                } else {
                    marginLayoutParams2.bottomMargin = 0;
                }
                this.i.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    @Override // tb.imb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3a3af3", new Object[]{this});
            return;
        }
        if (this.o == null) {
            CartSkeletonImageView cartSkeletonImageView = new CartSkeletonImageView(this.s);
            this.o = cartSkeletonImageView;
            cartSkeletonImageView.setAspectRatio(750, 1148, true);
            this.o.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01FR5Bfz1glPISpHTA3_!!6000000004182-2-tps-750-1148.png");
            this.o.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(3, R.id.float_header);
            this.o.setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout != null && relativeLayout.indexOfChild(this.o) == -1) {
            this.n.addView(this.o);
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51255697", new Object[]{this});
            return;
        }
        if (!ykl.a()) {
            this.l = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else if (this.E) {
            this.l = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else {
            this.l = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.m = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        this.l.setDuration(200L);
        this.m.setDuration(200L);
        this.l.setAnimationListener(new e());
    }

    @Override // tb.imb
    public TUrlImageView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e51f140d", new Object[]{this});
        }
        return this.o;
    }

    public final void e0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4d950b", new Object[]{this, new Boolean(z), str});
            return;
        }
        RecyclerView recyclerView = this.v;
        if (recyclerView != null) {
            if (z) {
                recyclerView.scrollToPosition(0);
                if (this.t.e()) {
                    this.t.k();
                    this.t.a();
                    this.t.b();
                    this.t.j(str);
                    return;
                }
                return;
            }
            CartRecyclerView cartRecyclerView = this.e;
            if (cartRecyclerView != null) {
                cartRecyclerView.removeEndView(recyclerView);
            }
        }
    }

    @Override // tb.imb
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f412e3", new Object[]{this, new Boolean(z)});
        } else if (this.C) {
            cfx cfxVar = this.x;
            if (cfxVar != null && cfxVar.i) {
                mc3.j(this.s, null, z);
            } else if (z) {
                View view = this.i;
                if (view != null) {
                    view.startAnimation(this.k);
                }
                RelativeLayout relativeLayout = this.n;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(this.m);
                }
                if (vav.a(c9x.CART_BIZ_NAME, "enableCartPopDismissAnimationV2", true)) {
                    this.m.setDuration(200L);
                    O();
                    U();
                    this.D.postDelayed(new m(), 200L);
                    this.n.clearFocus();
                    return;
                }
                V(true);
            } else {
                V(true);
            }
        }
    }

    @Override // tb.imb
    public void g(imb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bea6d71", new Object[]{this, bVar});
        } else {
            ((CopyOnWriteArrayList) this.A).remove(bVar);
        }
    }

    public final void g0(cfx cfxVar) {
        AlphaAnimation alphaAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ab301", new Object[]{this, cfxVar});
            return;
        }
        W(false);
        if (this.i != null && cfxVar.a() < 0) {
            this.i.setBackgroundColor(cfxVar.a());
        }
        if (this.g != null) {
            if (cfxVar.c() != null) {
                this.g.setVisibility(0);
                this.g.setContentDescription(Localization.q(R.string.app_close));
                this.g.setImageDrawable(cfxVar.c());
                this.g.setOnClickListener(new h());
            } else {
                this.g.setVisibility(8);
            }
        }
        if (cfxVar.g() < 0) {
            float f2 = cfxVar.f();
            float b2 = cfxVar.b();
            if (ykl.a()) {
                b2 = 0.0f;
                ((RoundRelativeLayout) this.n).setRadius(0.0f, 0.0f, 0.0f, 0.0f);
                f2 = 0.0f;
            }
            this.n.setBackgroundDrawable(mgw.b(cfxVar.g(), f2, b2));
        }
        CartSkeletonImageView cartSkeletonImageView = this.o;
        if (cartSkeletonImageView != null) {
            cartSkeletonImageView.setVisibility(8);
        }
        View view = this.i;
        if (view != null) {
            view.setEnabled(true);
        }
        c(127);
        c0();
        View view2 = this.i;
        if (!(view2 == null || (alphaAnimation = this.j) == null)) {
            view2.startAnimation(alphaAnimation);
        }
        TranslateAnimation translateAnimation = this.l;
        if (translateAnimation != null) {
            this.n.startAnimation(translateAnimation);
        }
        if (this.c.getParent() == null) {
            if (cfxVar.d() != null) {
                this.q.addView(this.c);
            } else {
                this.r.addView(this.c);
            }
        }
        h0(cfxVar.i());
        if (this.M == null) {
            this.M = new i();
            this.r.getViewTreeObserver().addOnGlobalLayoutListener(this.M);
        }
    }

    @Override // tb.imb
    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        return this.B;
    }

    @Override // tb.imb
    public et6 getDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("5bbeafb0", new Object[]{this});
        }
        return this.f7987a;
    }

    @Override // tb.imb
    public void h(imb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195f8cf4", new Object[]{this, bVar});
        } else if (!((CopyOnWriteArrayList) this.A).contains(bVar)) {
            ((CopyOnWriteArrayList) this.A).add(bVar);
        }
    }

    public final void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0b88fc", new Object[]{this, new Boolean(z)});
        } else if (z) {
            et6 et6Var = this.f7987a;
            if (et6Var == null || et6Var.h() == null || this.f7987a.h().isEmpty()) {
                this.G.c();
            } else {
                this.G.f(this.x);
            }
            this.u.d().l(this.N);
            this.u.d().k(this.O);
        } else {
            this.G.f(this.x);
        }
    }

    @Override // tb.imb
    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    @Override // tb.imb
    public RecyclerView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("5d00c9d0", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.imb
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.J = true;
        this.z = this.u.d();
        this.s = this.u.getContext();
        this.b = this.u.e().t();
        this.r = (ViewGroup) this.s.getWindow().getDecorView();
        this.c = new FrameLayout(this.s);
        CartPopRecyclerView cartPopRecyclerView = new CartPopRecyclerView(this.s, this);
        this.e = cartPopRecyclerView;
        cartPopRecyclerView.setCartPresenter(this.u);
        this.A = new CopyOnWriteArrayList();
        this.B = new ArrayList();
        this.D = new Handler(Looper.getMainLooper());
        View view = new View(this.s);
        this.F = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.F.setBackgroundColor(-1);
        this.H = new ArrayList();
        jg2 jg2Var = new jg2(this.e);
        this.I = jg2Var;
        ((ArrayList) this.H).add(jg2Var.b());
    }

    @Override // tb.imb
    public boolean isFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.r;
        if (viewGroup == null || viewGroup.indexOfChild(this.c) == -1) {
            return false;
        }
        return true;
    }

    @Override // tb.imb
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.c.getParent() != null || (vav.a(c9x.CART_BIZ_NAME, "compatPopShowing", true) && mc3.m(null))) {
            return true;
        }
        return false;
    }

    @Override // tb.imb
    public void j(imb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41dfd0b", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    @Override // tb.imb
    public void k(cfx cfxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642046e5", new Object[]{this, cfxVar});
            return;
        }
        this.x = cfxVar;
        this.E = TBAutoSizeConfig.x().T(this.b.K());
        if (cfxVar.i) {
            f0(cfxVar);
        } else {
            g0(cfxVar);
        }
        if (!cfxVar.i()) {
            this.e.showCushionView(true);
        }
    }

    @Override // tb.imb
    public void l(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea82aa", new Object[]{this, et6Var});
        } else {
            this.f7987a = et6Var;
        }
    }

    @Override // tb.imb
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f97c6c95", new Object[]{this})).intValue();
        }
        int H = TBAutoSizeConfig.x().H(this.s);
        if (!ykl.a()) {
            return H;
        }
        if (TBAutoSizeConfig.x().T(this.s)) {
            return H;
        }
        return H / 2;
    }

    @Override // tb.imb
    public void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.e;
        if (cartRecyclerView != null) {
            cartRecyclerView.resetScroll();
            this.e.scrollToPosition(0);
        }
        RecyclerView recyclerView = this.v;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5e9e49", new Object[]{this});
            return;
        }
        this.e.hideCushionView();
        this.G.c();
        String z = this.z.z();
        this.z.V("");
        this.z.U("");
        if (!this.x.i()) {
            this.u.e().D();
            return;
        }
        IDMComponent u = this.z.u("cartTimePromotion");
        if (u != null) {
            u.getData().put("status", (Object) "normal");
        }
        fsb c2 = this.z.c();
        if (c2 instanceof u55) {
            IDMComponent componentByName = ((u55) c2).getComponentByName(z);
            if (componentByName == null || componentByName.getFields() == null || !componentByName.getFields().getBooleanValue("refreshMainPageAfterDismissPop")) {
                u55 u55Var = (u55) c2;
                u55Var.v().k(u55Var);
                ir6.c(this.z, u55Var);
                this.u.e().B(this.u.d().d());
            } else {
                this.u.j0();
                this.x.m(true);
            }
        }
        if (this.F.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.F.getParent()).removeView(this.F);
        }
    }

    public final void f0(cfx cfxVar) {
        String containerType;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80314159", new Object[]{this, cfxVar});
        } else if (this.c == null) {
            ub3.g("CartPopupWindowManager#showWithStdPop", "contentView is null");
        } else {
            W(true);
            CartSkeletonImageView cartSkeletonImageView = this.o;
            if (cartSkeletonImageView != null) {
                cartSkeletonImageView.setVisibility(8);
            }
            c(127);
            ViewParent parent = this.c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c);
            }
            nc3 nc3Var = new nc3();
            nc3Var.z(cfxVar.h());
            nc3Var.v(this.c);
            boolean a2 = vav.a(c9x.CART_BIZ_NAME, na3.sEnablePanForStdPop, true);
            et6 et6Var = this.f7987a;
            if (!(et6Var == null || et6Var.c() == null)) {
                for (IDMComponent iDMComponent : this.f7987a.c()) {
                    if (!(iDMComponent == null || (containerType = iDMComponent.getContainerType()) == null || !("weex".equalsIgnoreCase(containerType) || "h5".equalsIgnoreCase(containerType)))) {
                        hav.g(c9x.CART_BIZ_NAME, "CartPopupWindowManager", "不兼容下拉,", containerType);
                        a2 = false;
                    }
                }
            }
            nc3Var.B(a2);
            if (cfxVar.d() == null) {
                z = true;
            }
            nc3Var.y(z);
            if (!z) {
                nc3Var.C(Integer.valueOf(R.id.cart_pop_placeholder));
            }
            boolean z2 = true ^ z;
            nc3Var.t(z2);
            nc3Var.s(z2);
            this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.c.setBackgroundColor(cfxVar.g());
            ViewManager Z = this.u.e();
            if (Z == null || Z.p() == null) {
                N(nc3Var, cfxVar.u());
            } else {
                Z.p().post(new j(nc3Var, cfxVar));
            }
            h0(cfxVar.i());
            hav.d("CartPopupWindowManager", na3.sShowWithStdPop);
        }
    }
}
